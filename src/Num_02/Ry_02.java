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
