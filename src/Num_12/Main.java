package Num_12;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";

    public static void printColored(String text, Colors color){
        String ANSI_COLOR = "\u001B["+color.getColorCode()+"m";
        System.out.print(ANSI_COLOR+text+ANSI_RESET);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            printColored("H", Colors.RED);
            printColored("el", Colors.ORANGE);
            printColored("lo", Colors.YELLOW);
            printColored(" w", Colors.GREEN);
            printColored("or", Colors.CYAN);
            printColored("ld", Colors.BLUE);
            printColored("!", Colors.MAGENTA);
            System.out.println();
        }
    }
}
