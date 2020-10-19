package Num_13;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";

    public static void tryPrint(String text, Colors color) throws Exception {
        String ANSI_COLOR = "\u001B["+color.getColorCode()+"m";
        System.out.print(ANSI_COLOR+text+ANSI_RESET);
    }

    public static void printColored(String text, Colors color) throws IncorrectColorException{
        String ANSI_COLOR = "\u001B["+color.getColorCode()+"m";
        System.out.print(ANSI_COLOR+text+ANSI_RESET);
    }

    public static void runtimePrint(String text, Colors color)throws RuntimeIncorrectColorException {
        String ANSI_COLOR = "\u001B["+color.getColorCode()+"m";
        System.out.print(ANSI_COLOR+text+ANSI_RESET);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            try {
                tryPrint("H", Colors.RED);
                tryPrint("el", Colors.ORANGE);
                tryPrint("lo", Colors.YELLOW);
                printColored(" w", Colors.GREEN);
                printColored("or", Colors.CYAN);

            } catch (IncorrectColorException ice){
                System.out.println("Incorrect color!");
            } catch (Exception ex) {
                System.out.println("Strange exception!");
            } finally {
                runtimePrint("ld", Colors.BLUE);
                runtimePrint("!", Colors.MAGENTA);
                System.out.println();
            }
        }
    }
}
