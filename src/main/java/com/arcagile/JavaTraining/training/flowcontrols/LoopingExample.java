package com.arcagile.JavaTraining.training.flowcontrols;

import java.util.Scanner;

public class LoopingExample {

    public static void main(String[] args) {

        /*
        while ( condition ) {
           // statements
        }*/
        //Ask is : I want to print the numbers from 1 to 10
        int i = 0;
        while ( i <= 10) {
            System.out.println(" value of i " +i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of values to be printed");
        Integer value = scanner.nextInt();
        System.out.println("A person wants to print the value until : " +value);

        //initilize the initial value to be printed from
        int initialValue = 1;
        System.out.println("Initial value : " +initialValue);
        while ( initialValue <= value ) {
            //System.out.println("Current Initial value : " +initialValue);
            System.out.println("Current value to be printed : " +initialValue);
            initialValue++;
        }

        int init = 0;
        //printing value from 1 to 10
        while ( init < 10) {
            init++;
            System.out.println(" The value of init : " +init);
        }

        //DO while example
        do {
            System.out.println("i am printing before while condition, the value of init " + init);
            init++;
        } while ( init <= 20);


        //For loop example
        for(int j = 1; j <= 20 ; j++ ) {
            System.out.println("The value of J is : " +j);
        }
    }
}
