package Num_05;

public class MovableCircle extends Circle implements Movable{
    private MovablePoint cen;

    public MovableCircle(double x, double y, double rad) {
        super(rad);
        cen = new MovablePoint(x, y);
    }

    public double getX() {
        return cen.getX();
    }

    public void setX(double x) {
        cen.setX(x);
    }

    public double getY() {
        return cen.getY();
    }

    public void setY(double y) { cen.setY(y); }

    @Override
    public void move(int x, int y) {
        cen.move(x, y);
    }
}
