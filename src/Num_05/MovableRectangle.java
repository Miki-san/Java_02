package Num_05;

public class MovableRectangle implements Movable {
    private MovablePoint UpLeft, DownRight;

    public MovableRectangle(double x, double y, double width, double height){
        UpLeft = new MovablePoint(x, y);
        DownRight = new MovablePoint(UpLeft.getX()+width, UpLeft.getY()+height);
    }

    public double getWidth() {
        return Math.abs((double)(UpLeft.getX() - DownRight.getX()));
    }

    public void setWidth(double width) {
        DownRight.setX(UpLeft.getX()+width);
    }

    public double getHeight() {
        return Math.abs((double)(UpLeft.getY() - DownRight.getY()));
    }

    public void setHeight(double height) {
        DownRight.setY(UpLeft.getY()+height);
    }

    @Override
    public void move(int x, int y) {
        UpLeft.move(x, y);
        DownRight.move(x, y);
    }
}
