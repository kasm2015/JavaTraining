package com.arcagile.JavaTraining.training.functionalinterface;

import java.util.function.Predicate;

public class FunctionalIntefaceExample {

    public static void main(String[] args) {

        //method implement for Functional interface using lambda expression
        SampleFunctionalInterface fi = (msg) -> {
            System.out.println(msg);
        };

        fi.display("Hello, i an sending message to functional interface mehotd");


        //In built functional interface in Java 8
        Predicate<Person> personPredicate = person -> person.getAge() > 20;

        boolean result = personPredicate.test(new Person("Meghna", 25));
        System.out.println("Result --> " +result);

        Predicate<Person> predicate = person -> person.getAge() > 50;

        result = predicate.test(new Person("Vivek",35));
        System.out.println("Person is senior citizen :" +result);


    }
}
