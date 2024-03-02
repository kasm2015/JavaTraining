package training.basics;

public class HelloWorld {

    String name;

    String firstName;
    String lastName;

    Integer age;
    String address;

    static String city;
    static String state;

    static  Integer zipCode;
    static {
        city = "Illinio";
        state = "Ohio";
        zipCode = 10;
    }

    //Naming Variable


    public static void main(String[] args) {
        System.out.println("Hello World, Welcome Java programming!!");
        //Creating an object
        HelloWorld obj1 = new HelloWorld();
        obj1.name = "Rahul";
        obj1.age = 12;
        obj1.address = "sample address";
        System.out.println("Name : " +obj1.name);
        System.out.println("Age : " +obj1.age);
        System.out.println("Address : " +obj1.address);

        //Invoking a method using object
        obj1.display();
        obj1.display2();

        //invoking a static method
        HelloWorld.display3();
        System.out.println("City : " +HelloWorld.city + ", State " +HelloWorld.state+ ", Zip code : "+HelloWorld.zipCode);
    }

    public static void main(String[] args, Integer a) {
        System.out.println("Hello World, Welcome Java programming!!");
    }

    //static methods are associated with classes
    public static void main(String[] args, boolean flag) {
        System.out.println("Hello World, Welcome Java programming!!");
    }

    //non-static method are associated with objects
    public void display()  {
        System.out.println("I am inside display method");
    }

    //non-static method are associated with objects
    public void display2()  {
        System.out.println("I am inside display method 2");
    }

    public static void display3() {
        System.out.println("I am inside display method 3 and it is static method");
    }



}
