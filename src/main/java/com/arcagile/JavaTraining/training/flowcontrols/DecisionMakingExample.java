package com.arcagile.JavaTraining.training.flowcontrols;

import java.util.Scanner;

public class DecisionMakingExample {

    public static void main(String[] args) {

        //If example, if-else example and if-else-if-else example
        int age = 60;
        //Check if the age is greater than 18
        if( age > 50) {
            System.out.println("Person is senior citizen");
        } else if( age > 18) {
            System.out.println("Person is an adult");
        } else if( age < 5) {
            System.out.println("He is an child");
        } else {
            System.out.println("Person is an teenager");
        }


        //Nestted If example
        int i = 12;

        if( i == 10 ) {
            if( i < 15) {
                System.out.println("i is smalled than 15");
            }
        } else {
            if( i > 15) {
                System.out.println("i is greater than 15");
            } else if( i > 10) {
                System.out.println("i is greater than 10");
            }
        }


        //taking an input value from console ( user input)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week : ");
        String str = scanner.next();
        //System.out.println("Today is :  "+str);
        switch (str) {
            case "Sunday" :
                System.out.println("Today is Sunday");
                break;
            case "Monday" :
                System.out.println("Today is Monday");
                break;
            case "Tuesday" :
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday" :
                System.out.println("Today is Wednesday");
                break;
            case "Thursday" :
                System.out.println("Today is Thursday");
                break;
            case "Friday" :
                System.out.println("Today is Friday");
                break;
            case "Saturday" :
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Enter values is not matching with week days");
                break;
        }

    }
}
