package Num_25;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> numbers = new HashTable<>();
        numbers.add(293, "Mark");
        numbers.add(294, "Mike");
        numbers.add(295, "Karl");
        for (Entry k : numbers) {
            System.out.println(k.getValue());
        }
        System.out.println("____");
        System.out.println(numbers.get(294));
    }

}