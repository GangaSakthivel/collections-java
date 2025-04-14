package set.java;

import java.util.HashSet;


public class SetFour {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        HashSet<String> removeThese = new HashSet<>();
        removeThese.add("Green");
        removeThese.add("Yellow");

        colors.removeAll(removeThese);

        System.out.println(colors); // [Red, Blue]

    }
}
