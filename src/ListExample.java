import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(); //creating a list
        //adding elements

        nameList.add("Ganga");
        nameList.add("Sakthivl");
        nameList.add("Neha");

        System.out.println(nameList);
        System.out.println("-----------------");

        //looping through elements
        for (String elements:nameList
             ) {
            System.out.println(elements);

        }

        System.out.println("------------------");

        nameList.set(1, "Meera");
        System.out.println(nameList);

        System.out.println("-------------------");

        //removing an element
        String removeElement = nameList.remove(2);
        System.out.println(removeElement);

        System.out.println(nameList);

        System.out.println("---------------------");

        System.out.println(nameList.size());




    }
}

//Common implementations: ArrayList, LinkedList, Vector, Stack