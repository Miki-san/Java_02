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
