public class ConstructorTwo {

    String name;
    int age;

    ConstructorTwo(){
        System.out.println("the default one.");
    }

    ConstructorTwo(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name +" " + age);
    }


    public static void main(String[] args) {

        ConstructorTwo c1 = new ConstructorTwo("Ganga", 23);


    }
}

//If you're using this.name, this.age, etc.,
// you're referring to the
//instance variables of the class. These should be declared outside the constructor/methods:

//✅ When you DON’T need this:
//If parameter names and instance variable names are different, Java can tell the difference:

