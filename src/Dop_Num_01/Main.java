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