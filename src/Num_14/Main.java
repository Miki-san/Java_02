package Num_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<String> laws = new ArrayList<>();
        String[] s = new String[2];
        String string, new_string = "";
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp = in.next() + " ";
            temp += in.next();
            laws.add(temp);
        }
        string = in.next();
        int i = 0;
        int k = 0;
        while((i < string.length())&&(k < n)){
            for (int t = 0; t < 2; t++){
                s[t] = laws.get(k).split(" ")[t];
            }
            if(string.substring(i).split(s[0], 2).length == 2){
                new_string += s[1];
                i += s[0].length();
                k++;
            }else{
                i++;
            }
        }
        if(i <= string.length()-1){
            new_string += string.substring(i);
        }
        System.out.println(new_string);
    }
}
