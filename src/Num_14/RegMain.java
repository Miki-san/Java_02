package Num_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> rules = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rules.put(in.next(), in.next());
        }
        String string, new_string = "";
        string = in.next();

        StringBuilder regex = new StringBuilder();
        String[] keys = rules.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            regex.append(keys[i]);
            if (i != keys.length - 1) regex.append("|");
        }

        Pattern pattern = Pattern.compile(regex.toString());
        Matcher match = pattern.matcher(string);
        new_string = match.replaceAll(x -> rules.get(x.group()));

        System.out.println(new_string);
    }
}
