package training.basics;

public class AccessModifier {


    private int data = 50;

    public static void main(String[] args) {

        //Java Variable - Local Variables, Class Variables( Static variables) , Instance variables ( non static variables)
        String localVariable1 = "I am local variable";
        System.out.println("Local variable : " +localVariable1);

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.displayMethod1();
        System.out.println("Accessing private variable : " +accessModifier.data);

        //Access Modifier - public, private , protected and default

    }

    public void displayMethod1() {

        //Local variable
        Integer var1 = 100;
        System.out.println("inside display method 1 , var1 : " +var1);
    }

}
