package Num_05;

public class Main {
    public static void main(String[] args) {
      MovableCircle  circle = new MovableCircle(5, 4, 3);
        System.out.println(circle.getX());
        System.out.println(circle.getY());
        circle.move(5, 3);
        System.out.println(circle.getX());
        System.out.println(circle.getY());
    }
}
