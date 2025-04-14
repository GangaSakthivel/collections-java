import java.util.ArrayList;

public class ArrayListExample {

    //resizable(dynamically grows)
    //allows duplicates
    //indexed
    //Generic: You can specify the type of elements it stores (e.g., ArrayList<String>).

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Generics in Java work only with reference types (objects)

        //adding elements

        numbers.add(100);
        numbers.add(200);
        numbers.add(499);
        numbers.add(399);
        numbers.add(599);

        System.out.println(numbers);
        System.out.println("-------------");
        numbers.remove(3);
        System.out.println(numbers);

        System.out.println("--------------");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println(colors);

        System.out.println("-----------------");

        System.out.println(colors.get(2));
        System.out.println("-----------------");

        colors.remove(2);
        System.out.println(colors);


    }
}
