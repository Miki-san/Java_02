package Num_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();


        Company company = new Company(name);
    }
}
