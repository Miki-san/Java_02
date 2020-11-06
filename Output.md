##### C:\Users\Miki_san\Desktop\Java_02\src\Dop_Num_01\Main.java
```java
package Dop_Num_01;

import java.util.Scanner;

public class Main {
    static int solve(int n) {
        int counter = 0;
        for (int i = n / 5; i >= 0; i--) {
            for (int j = (n - i * 5) / 3; j >= 0; j--) {
                 counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        System.out.println(solve(money));
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_01\Rykhlov_01.java
```java
package Num_01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rykhlov_01 {
    public static int getFactorial(int f) {
        int result = 1;
        for (int j = 1; j <= f; j++) {
            result = result * j;
        }
        return result;
    }

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum1 += arr[i];
        }
        int i = 0;
        while (i < n){
            sum2 += arr[i];
            i++;
        }
        i = 0;
        do{
            sum3 += arr[i];
            i++;
        }while(i != n);
        System.out.println(sum1 + "\n" + sum2 + "\n" + sum3);

        for (int j = 0; j < arg.length; j++){
            System.out.println(arg[j]);
        }

        System.out.print(1);
        for (double j = 2; j <= 10;  j++){
            System.out.print(" " + 1/j);
        }
        System.out.println();

        n = in.nextInt();
        int[] arr2 = new int[n];
        for (int j = 0; j < n;  j++){
            arr2[j] = (int)(Math.random()*100);
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        Arrays.sort(arr2);
        for(int j = 0; j < n; j++){
            System.out.print(arr2[j] + " ");
        }
        System.out.println();

        Random r = new Random();
        n = in.nextInt();
        int[] arr3 = new int[n];
        for (int j = 0; j < n;  j++){
            arr3[j] = r.nextInt();
            System.out.print(arr3[j] + " ");
        }
        System.out.println();
        Arrays.sort(arr3);
        for(int j = 0; j < n; j++){
            System.out.print(arr3[j] + " ");
        }
        System.out.println();
        System.out.println(getFactorial(4));
        in.close();
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_02\Ry_02.java
```java
package Num_02;
import java.util.ArrayList;
import java.util.Vector;

class Shape {
    int a = 2, b = 3, c = 4, d = 5;
    @Override
    public String toString() {
        return "Shape" + " " + a + " " + b + " " + c + " " + d;
    }
}

class Ball {
    int a = 2, b = 3, c = 4, d = 5;
    @Override
    public String toString() {
        return "Ball" + " " + a + " " + b + " " + c + " " + d;
    }
}

class Book {
    int a = 2, b = 3, c = 4, d = 5;
    @Override
    public String toString() {
        return "Book" + " " + a + " " + b + " " + c + " " + d;
    }
}

class Dog {
    String name;
    int age;
    Dog(String dog_name, int dog_age){
        name = dog_name;
        age = dog_age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

    int toHumanAge(){
        return age * 7;
    }
    void setAge(int dog_age){
        age = dog_age;
    }
    void setName(String dog_name){
        name = dog_name;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }

}

public class Ry_02{
    static ArrayList<Dog> arrDog = new ArrayList<>();
    static void addDog(String name, int age){
        arrDog.add(new Dog(name, age));
    }
    public static void main(String[] arg){
        Shape shape = new Shape();
        System.out.println(shape);
        addDog("Cnuckles", 4);
        System.out.println(arrDog.get(0));
        System.out.println(arrDog.get(0).toHumanAge());
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_03\Main.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_04\Main.java
```java
package Num_04;

public class Main {
    public static void main(String[] args){
        Square square = new Square(11,"green",true);
        System.out.println(square);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_04\Shape.java
```java
package Num_04;

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
class Circle extends Shape{
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

class Rectangle extends Shape{
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

class Square extends Shape{
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\Main.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\Movable.java
```java
package Num_05;

public interface Movable {
    void move(int x, int y);
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\MovableCircle.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\MovablePoint.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\MovableRectangle.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_05\Shape.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_06\Main.java
```java
package Num_06;
import java.util.Scanner;

public class Main {
    static double maximize(int[][] field){
        for (int i = 1; i < field.length; i++) {
            field[i][0] = field[i-1][0]+field[i][0];
            field[0][i] = field[0][i-1]+field[0][i];
        }
        for (int i = 1; i <field.length ; i++) {
            for (int j = 1; j <field.length ; j++) {
                field[i][j] = field[i][j]+Math.max(field[i][j-1],field[i-1][j]);
            }
        }
        return field[field.length-1][field.length-1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] field = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximize(field));

    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\Company.java
```java
package Num_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
    int count, current_count;
    String Name;
    double Income = 0;
    List<Employee> Staff = new ArrayList<Employee>();
    List<Employee> SortedStaff = new ArrayList<Employee>();

    Company(String name){
        this.Name = name;
        this.count = 0;
        this.current_count = 0;
    }

    double getIncome(){
        double counter = 0;
        for (Employee employee : Staff) {
            if(employee.position.getJobTitle() == "Manager"){
                counter += employee.Salary - employee.baseSalary;
            }
        }
        return counter;
    }

    void refresh(){
        current_count = count;
    };


    void hire(Employee employee){
        Staff.add(employee);
        SortedStaff.add(employee);
        this.count++;
    }

    void hireAll(List<Employee> employees){
        Staff.addAll(employees);
        SortedStaff.addAll(employees);
        this.count += employees.size();
    }

    void fire(int Id){
        for (int i = 0; i < Staff.size(); i++){
            if(Staff.get(i).id == Id){
                Staff.remove(i);
                break;
            }
        }
        SortedStaff.clear();
        SortedStaff.addAll(Staff);
        count --;
    }

    private void toSwap(Employee first, Employee second){
        Employee temp = first;
        first = second;
        second = temp;
    }

    public void bubbleSorter(List<Employee> employees){
        for (int out = count - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(employees.get(in).Salary > employees.get(in + 1).Salary)
                    toSwap(employees.get(in), employees.get(in + 1));
            }
        }
    }
    List<Employee> getSortedStaff(){
        bubbleSorter(this.SortedStaff);
        return SortedStaff;
    }

    List<Employee> getTopSalaryStaff(int Count){
        List<Employee> temp = new ArrayList<Employee>();
        temp.addAll(getSortedStaff());
        Collections.reverse(temp);

        return temp.subList(0, Count--);
    }

    List<Employee> getLowestSalaryStaff(int Count){
        List<Employee> temp = new ArrayList<Employee>();
        temp.addAll(getSortedStaff());
        return temp.subList(0, Count--);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\Employee.java
```java
package Num_07;

public class Employee {
    String surname, name;
    double baseSalary, Salary;
    int id;
    EmployeePosition position;
    Company selfCompany;

    Employee(String Surname, String Name, double BaseSalary, EmployeePosition Position, Company company, int Id){
        this.surname = Surname;
        this.name = Name;
        this.baseSalary = BaseSalary;
        this.selfCompany = company;
        this.id = Id;
        this.setPosition(Position);
        this.Salary = position.calcSalary(this.baseSalary);
    }

    @Override
    public String toString() {
        return "{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", id=" + id +
                ", position=" + position.getJobTitle() +
                ", Company=" + selfCompany.Name +
                '}';
    }

    void setPosition(EmployeePosition position){
        this.position = position;
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\EmployeePosition.java
```java
package Num_07;

public interface EmployeePosition {
    String getJobTitle();
    double calcSalary(double baseSalary);
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\Main.java
```java
package Num_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        Company company = new Company(name);
        List<Employee> newStaff = new ArrayList<Employee>();
        List<Employee> TopSalary = new ArrayList<Employee>();
        List<Employee> LowSalary = new ArrayList<Employee>();
        int id = 0;
        for(int i = 0; i < 180; i++){
            newStaff.add(new Employee("Puchkova", "Angelina", 20000, new Operator(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        for(int i = 0; i < 80; i++){
            newStaff.add(new Employee("Zhumaisimba", "Maksek", 45000, new Manager(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        for(int i = 0; i < 10; i++){
            newStaff.add(new Employee("Anikfeev", "Sergey", 60000, new TopManager(company), company, id));
            id++;
        }
        company.hireAll(newStaff);
        newStaff.clear();
        company.refresh();

        TopSalary.addAll(company.getTopSalaryStaff(13));
        for (Employee emp : TopSalary) {
            System.out.println(emp.toString());
        }

        System.out.println("_________________________________________________________________________________________");

        LowSalary.addAll(company.getLowestSalaryStaff(30));
        for (Employee emp : LowSalary){
            System.out.println(emp.toString());
        }

        for (int i = 0; i < company.current_count; i++){
            if(i % 2 == 1){
                company.fire(i);
            }
        }
        company.refresh();

        System.out.println();
        System.out.println("Deleting 50% employees....");
        System.out.println("Data refreshed.");
        System.out.println();

        TopSalary.clear();
        LowSalary.clear();

        TopSalary.addAll(company.getTopSalaryStaff(13));
        for (Employee emp : TopSalary) {
            System.out.println(emp.toString());
        }

        System.out.println("_________________________________________________________________________________________");

        LowSalary.addAll(company.getLowestSalaryStaff(30));
        for (Employee emp : LowSalary){
            System.out.println(emp.toString());
        }
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\Manager.java
```java
package Num_07;

public class Manager implements EmployeePosition {
    Company selfCompany;
    Manager(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05 * (115000 + (int)(35000 * Math.random()));
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\Operator.java
```java
package Num_07;

public class Operator implements EmployeePosition {
    Company selfCompany;
    Operator(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_07\TopManager.java
```java
package Num_07;

public class TopManager implements EmployeePosition{
    Company selfCompany;
    TopManager(Company company){
        this.selfCompany = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(selfCompany.getIncome() > 10000000){
            return baseSalary * 2.5;
        }else{
            return baseSalary;
        }
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\Company.java
```java
package Num_09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final ArrayList<Employee> employee;
    private int count, current_count;

    public Company() {
        this.current_count = 0;
        this.count = 0;
        employee = new ArrayList<>();
    }

    private void refresh(){
        current_count = count;
    };

    public void hire(Employee emp){
        employee.add(emp);
        this.count++;
    }

    public void fire(String phone_num){
        for (int i = 0; i < employee.size(); i++){
            if(employee.get(i).phone_number == phone_num){
                employee.remove(i);
                break;
            }
        }
        count --;
    }


    public void doSomethingWithEmployee(SelectorEmployees selector, HandleEmployees handler){
        int count = 0;
        for (Employee emp : employee){
            if(selector.isNeedEmployee(emp)){
                handler.handleEmployee(emp, emp.phone_number);
                count++;
            }
        }
        System.out.println(count);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\Employee.java
```java
package Num_09;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    String name, surname, birthplace, phone_number;
    int salary;
    LocalDate ld;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Employee(String name, String surname, String birthplace, String phone_number, int salary, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
        this.phone_number = phone_number;
        this.salary = salary;
        this.ld = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getLd() {
        return ld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                ", ld=" + f.format(ld) +
                '}';
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\HandleEmployees.java
```java
package Num_09;

public interface HandleEmployees {
    void handleEmployee(Employee employee, String phone_num);
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\Main.java
```java
package Num_09;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        String num;
        Company company = new Company();
        Random r = new Random();
        for (int i = 0; i < 50; i++){
            num = "+8-";
            k = 100 + r.nextInt(900);
            num += String.valueOf(k) + "-";
            k = 10 + r.nextInt(90);
            num += String.valueOf(k) + "-";
            k = 10 + r.nextInt(90);
            num += String.valueOf(k);
            company.hire(new Employee("Maksim", "Astaf'ev", "Moscow", num, 30_000 + r.nextInt(20_000), 1900 + r.nextInt(120), 1 + r.nextInt(12), 1 + r.nextInt(28)));
        }
        company.doSomethingWithEmployee(new YearSelector(1956, 2000), (employee, phone_num) -> System.out.println("employee" + phone_num + ":" + employee));

        int yearStart = 1956;
        int yearEnd = 2000;
        company.doSomethingWithEmployee(new SelectorEmployees() {
            @Override
            public boolean isNeedEmployee(Employee employee) {
                return employee.getLd().getYear() >= yearStart && employee.getLd().getYear() <= yearEnd;
            }
        }, new HandleEmployees() {
            @Override
            public void handleEmployee(Employee employee, String phone_num) {
                System.out.println("======" + phone_num + "======");
                System.out.println(employee);
            }
        });
        ArrayList<Employee> selection = new ArrayList<>();
        company.doSomethingWithEmployee(employee -> employee.getLd().getYear() > 1967, ((employee, phone_num) -> selection.add(employee)) );
        System.out.println(selection);

        SelectorEmployees selector = employee -> employee.getLd().getYear() > 1967;
        company.doSomethingWithEmployee(selector, Main::doSome);
    }
    static void doSome(Employee employee, String phone_num){
        System.out.println("++++++" + phone_num + "++++++");
        System.out.println(employee);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\SelectorEmployees.java
```java
package Num_09;

public interface SelectorEmployees {
    boolean isNeedEmployee(Employee employee);
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_09\YearSelector.java
```java
package Num_09;

public class YearSelector implements SelectorEmployees {
    private int yearStart, yearEnd;

    public YearSelector(int yearStart, int yearEnd) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    @Override
    public boolean isNeedEmployee(Employee employee) {
        return employee.getLd().getYear() >= yearStart && employee.getLd().getYear() <= yearEnd;
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_10\Main.java
```java
package Num_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MySwingApp app = new MySwingApp();
            app.setResizable(false);
            app.setVisible(true);
        });
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_10\MySwingApp.java
```java
package Num_10;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class VerticalLayout implements LayoutManager {
    private Dimension size = new Dimension();

    @Override
    public void addLayoutComponent(String name, Component comp) {}

    @Override
    public void removeLayoutComponent(Component comp) {}

    @Override
    public Dimension preferredLayoutSize(Container c) {
        return calculateBestSize(c);
    }

    @Override
    public Dimension minimumLayoutSize(Container c) {
        return calculateBestSize(c);
    }

    @Override
    public void layoutContainer(Container container) {
        Component list[] = container.getComponents();
        int currentY = 5;
        for (int i = 0; i < list.length; i++) {
            Dimension pref = list[i].getPreferredSize();
            list[i].setBounds(5, currentY, pref.width, pref.height);
            currentY += 10;
            currentY += pref.height;
        }
    }

    private Dimension calculateBestSize(Container c)
    {
        Component[] list = c.getComponents();
        int maxWidth = 0;
        for (int i = 0; i < list.length; i++) {
            int width = list[i].getWidth();
            if ( width > maxWidth )
                maxWidth = width;
        }
        size.width = maxWidth + 5;
        int height = 0;
        for (int i = 0; i < list.length; i++) {
            height += 5;
            height += list[i].getHeight();
        }
        size.height = height;
        return size;
    }
}


public class MySwingApp extends JFrame {
    public MySwingApp() {
        Font mainFont = new Font("Arial",Font.BOLD,24);

        DecimalFormat dc = new DecimalFormat("###.####");
        setTitle("My swing app!!!");
        setSize(200, 175);

        JTextField field_a = new JTextField("                                                   ");
        JTextField field_b = new JTextField("                                                   ");

        List<JButton> buttons = new ArrayList<>();
        buttons.add(new JButton("+"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("*"));
        buttons.add(new JButton("/"));


        Label label_res = new Label("                                                   ");

        for (JButton but : buttons) {
            but.addActionListener(action -> {
                double a, b;
                try {
                    a = Double.parseDouble(field_a.getText());
                    b = Double.parseDouble(field_b.getText());
                    switch (but.getText()) {
                        case "+":
                            label_res.setText("= " + dc.format(a + b));
                            break;
                        case "-":
                            label_res.setText("= " + dc.format(a - b));
                            break;
                        case "*":
                            label_res.setText("= " + dc.format(a * b));
                            break;
                        case "/":
                            label_res.setText("= " + dc.format(a / b));
                            break;
                    }
                } catch (Exception ex) {
                    label_res.setText(ex.toString());
                }
            });
        }

        JPanel main_panel = new JPanel(new VerticalLayout());
        List<JPanel> panels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            panels.add(new JPanel());
        }

        GridLayout layout = new GridLayout(1, 1);
        int k = 0;
        for (JPanel pan : panels) {
            pan.setLayout(layout);
            if (k == 1) {
                layout.setColumns(4);
            } else {
                layout.setColumns(1);
            }
            k++;
        }

        panels.get(0).add(field_a);
        for (JButton but : buttons) {
            panels.get(1).add(but);
        }
        panels.get(2).add(field_b);
        panels.get(3).add(label_res);

        for (JPanel pan : panels) {
            main_panel.add(pan);
        }

        add(main_panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_11\Threads.java
```java
package Num_11;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Threads {
    private final static AtomicInteger totalSum = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            work(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++){
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }
        endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum.get());
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        double result = doHardWork(i * 1000, 50000000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static double doHardWork(int start, int count) {
        double a = 1;
        for (int i = 0; i < count; i++) {
            a += Math.cbrt(a) * Math.exp(2) + Math.sqrt(start);
            totalSum.incrementAndGet();
        }
        return a;
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_12\Colors.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_12\Main.java
```java
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
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_13\doSome.java
```java
package Num_13;

public class doSome {
    public double count;

    public doSome() {
        this.count = 30;
    }

    public double doSomethingWithCount(double i) throws IncorrectNumException {
        if(i == 1){
            throw new IncorrectNumException();
        }
        this.count *= Math.log(i);
        return this.count;
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_13\IncorrectNumException.java
```java
package Num_13;

public class IncorrectNumException extends IllegalArgumentException{
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_13\Main.java
```java
package Num_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        doSome obj = new doSome();
        boolean bool;
        try {
            double i = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.println(obj.doSomethingWithCount(i));
        } catch (IncorrectNumException ine){
            System.out.println("Num cannot equals 1");
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong num!");
        } finally {
            System.out.println();
        }
        System.out.println("If something wrong write 'true'");
        bool = new Scanner(System.in).nextBoolean();
        if (bool){
            throw new RuntimeIncorrectNumException();
        }
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_13\RuntimeIncorrectNumException.java
```java
package Num_13;

public class RuntimeIncorrectNumException extends RuntimeException{
    public RuntimeIncorrectNumException() {
        System.out.println("Runtime error!");
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_14\Main.java
```java
package Num_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> laws = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp = in.next() + " ";
            temp += in.next();
            laws.add(temp);
        }
        String string, new_string = "";
        string = in.next();
        String[] s = new String[2];
        boolean flag;
        for (int i = 0; i < string.length(); i++) {
            flag = false;
            for(int k = 0; k < laws.size(); k++) {
                for (int t = 0; t < 2; t++) {
                    s[t] = laws.get(k).split(" ")[t];
                }
                if (i + s[0].length() <= string.length()){
                    if (s[0].equals(string.substring(i, i + s[0].length()))) {
                        new_string += s[1];
                        i += s[0].length() - 1;
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                new_string+=string.charAt(i);
            }
        }
        System.out.println(new_string);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_14\RegMain.java
```java
package Num_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> key = new ArrayList<>();
        ArrayList<String> law = new ArrayList<>();
        Map<String,String> rules = new HashMap<>();
        for (int i = 0; i < n; i++) {
            key.add(in.next());
            law.add(in.next());
        }
        String string, new_string = "";
        string = in.next();

        StringBuilder regex = new StringBuilder();

        for (int i = 0; i < key.size(); i++) {
            regex.append(key.get(i));
            if (i != key.size() - 1) regex.append("|");
        }

        for (int i = 0; i < key.size(); i++) {
            rules.put(key.get(i), law.get(i));
        }
        Pattern pattern = Pattern.compile(regex.toString());
        Matcher match = pattern.matcher(string);
        new_string = match.replaceAll(x -> rules.get(x.group()));

        System.out.println(new_string);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_15\Main.java
```java
package Num_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Nodes> nodes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nodes.add(new Nodes());
        }
        nodes.get(0).addLink(nodes.get(1), 1);
        nodes.get(0).addLink(nodes.get(4), 2);
        nodes.get(1).addLink(nodes.get(2), 4);
        nodes.get(1).addLink(nodes.get(3), 6);
        nodes.get(2).addLink(nodes.get(3), 6);
        nodes.get(2).addLink(nodes.get(4), 2);
        nodes.get(3).addLink(nodes.get(2), 3);
        nodes.get(3).addLink(nodes.get(4), 5);
        nodes.get(4).addLink(nodes.get(0), 5);
        nodes.get(4).addLink(nodes.get(2), 3);
        Nodes current_node = new Nodes();
        current_node = nodes.get(0);
        n = Integer.parseInt(in.next());
        while (n != -1) {
            current_node.getCommand(n);
            current_node = current_node.getLinks().get(n);
            n = Integer.parseInt(in.next());
        }
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_15\Nodes.java
```java
package Num_15;

import java.util.ArrayList;
import java.util.Arrays;

public class Nodes {
    private ArrayList<Integer> command = new ArrayList<>();
    private ArrayList<Nodes> links = new ArrayList<>();
    private final ArrayList<String> commands = new ArrayList<>();

    public Nodes() {
        String[] init_comm = {"create_project", "add_library", "restart", "test", "deploy", "drop_db"};
        this.commands.addAll(Arrays.asList(init_comm));
    }

    public void getCommand(int index) {
        System.out.println(commands.get(command.get(index) - 1));
    }

    public void setCommandToNode(int command, int index) {
        this.command.add(index, command); ;
    }

    public void setNewCommand(String command){
        this.commands.add(command);
    }

    public ArrayList<Nodes> getLinks() {
        return links;
    }

    public void addLink(Nodes link, int comm) {
        this.command.add(comm);
        this.links.add(link);
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Num_17\Main.java
```java
package Num_17;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter("Output.md");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public static void getContent(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] contents = file.list();
            for (String s : contents) {
                getContent(path + "\\" + s);
            }
        }
        if (file.isFile()) {
            if (file.getName().endsWith(".java")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    printWriter.write("##### " + path + "\n```java\n");
                    String string = reader.readLine();
                    while (string != null) {
                        printWriter.write(string + "\n");
                        string = reader.readLine();
                    }
                    printWriter.write("```\n");
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get("").toAbsolutePath();
        getContent("C:\\Users\\Miki_san\\Desktop\\Java_02\\src");
        printWriter.close();
    }
}
```
##### C:\Users\Miki_san\Desktop\Java_02\src\Threads\Threads.java
```java
package Threads;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.State.TERMINATED;

public class Threads {

    static int totalSum;
    static ArrayList<Integer> thread_count = new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <  4; i++){
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
            thread_count.add(0);
        }
        for (Thread t : threads) {
            t.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        for (Integer i : thread_count) {
            totalSum +=i ;
        }
        System.out.println("total sum: " + totalSum);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i, 100_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count) {
        long a = 0;
        int b = start * 1000;
        for (int i = 0; i < count; i++) {
            a += (b + i) * (b + i) * Math.sqrt(b + i);
            thread_count.set(start, thread_count.get(start)+1);
        }
        return a;
    }
}
```
