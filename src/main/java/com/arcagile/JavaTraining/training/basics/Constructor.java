package training.basics;

public class Constructor {

    String name;
    Integer age;


    //Default constructor
    public Constructor() {
        System.out.println("I am inside constructor");
        name = "Rahul";
        age = 10;
    }

    //parameterized constructor
    public Constructor(String name, Integer age) {
        System.out.println("I am inside parameterized constructor");
        this.name = name;
        this.age = age;

    }



    public static void main(String[] args) {
        System.out.println("i am inside main");
        Constructor constructor = new Constructor();
        System.out.println("Name : " + constructor.name+ ", age : " +constructor.age);

        //Invoking parameterized constructor
        Constructor constructor1 = new Constructor("Mohan",12);
        System.out.println("Parameterized constructor values : Name - " +constructor1.name + ", Age : " +constructor1.age);
    }

}
