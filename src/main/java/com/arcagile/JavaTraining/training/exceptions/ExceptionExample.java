package com.arcagile.JavaTraining.training.exceptions;

import training.polymorphism.Bank;

import java.io.File;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {
        int a = 5;

        int b = 5;

        String str = "hello";

        try {
            //throws Runtime Exception
            System.out.println("Division of two numbers : " +a/b);
            System.out.println("Value of string : " +str.charAt(0));

            division(9,6);

            //Calling User defined exception
            //throw new MyException("Exception thrown by user");

            throw new UserException("Exception thrown by user defined class");

        } catch (ArithmeticException aex) {
            System.out.println("throwing an arthimetic exception");
        } catch (StringIndexOutOfBoundsException strindex) {
            System.out.println(" expcetion thrown by array index out of bound" +strindex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Exception thrown ");
            ex.printStackTrace();
        }
    }

    public static void division(int a, int b) throws Exception {
        System.out.println(" division of two numbers : " +a/b);
    }


}
