package Num_03;

class Circle{
    int x,y,rad;
    Circle(int X, int Y, int Rad){
        x = X;
        y = Y;
        rad = Rad;
    }

    public int getRad() { return rad; }

    public int getX() { return x; }

    public int getY() { return y; }

    public void setRad(int rad) { this.rad = rad; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "Circle{"+
                "x=" + x +
                ", y=" + y +
                ", radius=" + rad +
                '}';
    }
}

class Human {
    Head head;
    Hand left_hand, right_hand;
    Leg left_leg, right_leg;

    Human(double handLength, double legLength) {
        left_hand = new Hand(handLength);
        right_hand = new Hand(handLength);
        left_leg = new Leg(legLength);
        right_leg = new Leg(legLength);
    }

    @Override
    public String toString() {
        return "Human{" +
                "Left hand length=" + left_hand.getLength() +
                ", Right hand length=" + right_hand.getLength() +
                ", Left leg length=" + left_leg.getLength() +
                ", Right leg length=" + right_leg.getLength() +
                '}';
    }
}

class Leg{
    private double length;
    Leg(double Length){
        length = Length;
    }

    public void setLength(double Length) {
        this.length = Length;
    }

    public double getLength() {
        return length;
    }
}
class Hand{
    private double length;
    Hand(double Length){
        length = Length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
class Head{
}


class Book{
    String author;
    String name;
    int year;
    Book(String Author, String Name, int Year){
        author = Author;
        name = Name;
        year = Year;
    }

    public int getYear() { return year; }

    public String getAuthor() { return author; }

    public String getName() { return name; }

    public void setAuthor(String author) { this.author = author; }

    public void setName(String name) { this.name = name; }

    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Main{
    public static void main(String[] args) {
        Human human = new Human(20,40);
        Circle circle = new Circle(20, 20, 10);
        Book book = new Book("Ландау и Лифшиц","Механика",1940);
        System.out.println(circle);
        System.out.println(human);
        System.out.println(book);

    }
}