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
