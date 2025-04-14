package set.java;

import java.util.HashSet;


public class SetThree {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        setA.add("Apple");
        setA.add("Banana");
        setA.add("Cherry");

        HashSet<String> setB = new HashSet<>();
        setB.add("Banana");
        setB.add("Cherry");
        setB.add("Date");

        setA.retainAll(setB); // only common elements are kept

        System.out.println(setA);
    }
}
