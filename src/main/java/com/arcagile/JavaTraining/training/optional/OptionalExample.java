package com.arcagile.JavaTraining.training.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String[] str = new String[10];

        //String str1 = str[5].toLowerCase();
        //System.out.println(str1);

        Optional<String> checkValue = Optional.ofNullable(str[5]);

        if( checkValue.isPresent()) {
          String str1 = str[5].toLowerCase();
            System.out.println(str1);
        } else {
            System.out.println("String value at 5th index is not present");
        }

        Optional<String> gender = Optional.of("MALE");

        System.out.println("Non empty optional : " +gender);

        System.out.println("Gender value = " +gender.get() + " is Present : " +gender.isPresent());

        System.out.println("Gender check for emtpy : " +gender.isEmpty());


        String name = null;

        String name1 = Optional.ofNullable(name).orElse(" Sujith");

        System.out.println(name1);

    }
}
