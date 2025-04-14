package set.java;

import java.util.HashSet;

public class SetExampleTwo {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Bangalore");
        city.add("Chennai");
        city.add("Delhi");

        System.out.println("Unique cities count" + city.size());

        System.out.println("Contains pune" + city.contains("Pune"));

        System.out.println(city.remove("Chennai"));
        for (String elements: city
             ) {
            System.out.println(elements);

        }


        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");

        HashSet<String> set2 = new HashSet<>();
        set2.add("C++");
        set2.add("Python");

        set1.addAll(set2);
        System.out.println(set1); // [Java, Python, C++]
    }
}
