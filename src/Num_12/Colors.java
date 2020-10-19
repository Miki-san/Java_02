package Num_12;

public enum Colors {
    YELLOW(33),
    ORANGE(93),
    GREEN(92),
    BLUE(34),
    MAGENTA(35),
    CYAN(96),
    GRAY(37),
    WHITE(97),
    RED(31);

    private int colorCode;

    Colors(int colorCode) {
        this.colorCode = colorCode;
    }

    public int getColorCode() {
        return colorCode;
    }
}
