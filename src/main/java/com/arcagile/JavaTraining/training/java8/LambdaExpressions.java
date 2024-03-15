package com.arcagile.JavaTraining.training.java8;

import io.micrometer.observation.Observation;

public class LambdaExpressions {

    public static void main(String[] args) {

        int i = 10;

        Drawable drawable = () -> {
            System.out.println("Printing the value of i" +i);
        };

        drawable.display();

        Printable printable = (msg) -> System.out.println(msg);
        
        printable.print("Hello i am being printed through lambda expression with single parameter");

        System.out.println("Lambda Expression with multiple parameter");

        Addition addition = (a, b) -> (a + b);

        int value = addition.add(10, 15);
        System.out.println("The addition of two number using lambda expression " +value);
    }
}


