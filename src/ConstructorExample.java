class Person{
    String name;

    Person(){
        System.out.println("Constructor is called");
        name = "Ganga";
    }


}
public class ConstructorExample {

    public static void main(String[] args) {

        Person p = new Person(); //here is where the default constructor is called
        System.out.println(p.name);

    }
}
