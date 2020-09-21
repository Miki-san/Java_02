package Num_05;

public class MovablePoint implements Movable {
    private  double x, y;
    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
