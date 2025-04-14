package set.java;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        //duplicates are not allowed


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Apple");

        System.out.println(fruits);

        System.out.println(fruits.contains("Banana"));//checking if a particular element exists

        fruits.remove("Watermelon");

        System.out.println(fruits);

        System.out.println(fruits.size());

        for (String elements:
             fruits) {
            System.out.println(elements);

        }

    }
}
