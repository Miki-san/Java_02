package Num_05;

public abstract class Shape {
    String color;
    boolean filled;
    Shape(){};
    Shape(String Color, boolean Filled){
        color = Color;
        filled = Filled;
    }

    public void setColor(String Color) { color = Color; }
    public String getColor() { return color; }
    public void setFilled( boolean Filled) { filled = Filled; }
    public boolean isFilled() { return filled; }

    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends Shape {
    private double radius;
    Circle(double Radius){
        radius = Radius;
    }
    Circle(double Radius, String color,boolean filled){
        super(color,filled);
        radius = Radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    double getArea() { return Math.PI*Math.pow(getRadius(),2); }

    @Override
    double getPerimeter() { return Math.PI*radius*2; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}

class Rectangle extends Shape {
    private double width,height;
    Rectangle(double Width, double Height){
        width = Width;
        height = Height;
    }
    Rectangle(double Width, double Height, String color, boolean filled){
        super(color,filled);
        width = Width;
        height = Height;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    @Override
    double getArea() { return width*height; }

    @Override
    double getPerimeter() { return 2*(width+height); }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}

class Square extends Shape {
    private double side;
    Square(double Side){
        side = Side;
    }
    Square(double Side, String color, boolean filled){
        super(color,filled);
        side = Side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    double getPerimeter() {
        return side*4;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}