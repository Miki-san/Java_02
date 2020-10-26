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
