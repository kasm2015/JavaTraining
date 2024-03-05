package com.arcagile.JavaTraining.training.wrappers;

public class Wrappers {

    public static void main(String[] args) {
        //primitive types
         int x = 5;
         float y = 3.14f;
         long z = 4262623;
         boolean m = true;

         //Wrapper Classes ( Autoboxing -
         Integer intObj = x;
         Float floatObj = y;
         Long longObj = z;
         Boolean boolObj = m;

        System.out.println("Int Obj : " +intObj);
        System.out.println("Float Obj : " +floatObj);
        System.out.println("Long Obj : " +longObj);
        System.out.println("Boolean Obj : " +boolObj);

        //Creating an object of Wrapper classes
        Integer integerObj = 5;
        Float floatObj1 = 1.0f;
        Long longObj1 = 2332632L;
        Boolean booleanObj = true;
        Character character = 'c';
        String str = new String("sample");

        //Operations
        String strObj = new String("programming");

        String strObj1 = new String("Java is a programming language");
        String[] str1 = strObj1.split(" ");
        System.out.println("String using Contains method : " + strObj.contains("p"));

        System.out.println("String using split method : " + str1.length);
        System.out.println("Printing words from string array after spliting by space");
        for( String str2 : str1) {
            System.out.println(str2);
        }

        String stringObj1 = new String("hello");
        String stringObj2 = new String("Hello");

        System.out.println("Comparing two strings with Case sensitive : " + stringObj1.equals(stringObj2));
        System.out.println("Comparing two strings with Case insensitive : " + stringObj1.equalsIgnoreCase(stringObj2));

        String s = "Rahul"; //object reference is initially to Rahul
        System.out.println("Printing the value of S : " +s);

        // after re initilized, It will loose memory reference to value :  Rahul and allocate the object(s) reference to Sharma
        s = "Sharma";
        System.out.println("Printing the value of s after re assigning the value : " +s);

        s.concat(" Indian Cricket");
        System.out.println("The value of s using concat method : " +s);

        s.concat(" Mumbai");
        System.out.println("The value of s using concat method : " +s);


    }

}
