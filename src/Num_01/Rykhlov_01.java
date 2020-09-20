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
