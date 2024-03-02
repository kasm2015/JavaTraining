package training.polymorphism;

public class MethodOverridingExtendExample extends  MethodOverridingExample {

    public void display() {
        System.out.println("I am inside display method of  MethodOverridingExtendExample class");
    }

    public static void main(String[] args) {
        MethodOverridingExtendExample object = new MethodOverridingExtendExample();
        object.display();
    }

}
