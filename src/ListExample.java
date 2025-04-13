import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(); //creating a list
        //adding elements

        nameList.add("Ganga");
        nameList.add("Sakthivl");
        nameList.add("Neha");
        nameList.add("Abc");
        nameList.add("Cgr");
        nameList.add("sfjkf");

        System.out.println(nameList);

        //looping through elements
        for (String elements:nameList
             ) {
            System.out.println(elements);

        }





    }
}
