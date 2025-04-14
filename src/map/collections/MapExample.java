package map.collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        // Duplicate key (updates value)
        map.put(101, "Java SE");

        System.out.println(map);

        //accessing value
        System.out.println(map.get(103));


        //checking particular key or value exists or not
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("Kotlin"));

        //iteration
        for(Integer key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        //removing a key and its value
        map.remove(102);
        System.out.println(map);
    }
}
