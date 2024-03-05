package com.arcagile.JavaTraining.training.wrappers;

public class StringBufferExample {

    //String buffer and String builder both mutable classes

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        System.out.println("Printing the value of sb : " +sb);

        sb.append(" World");
        System.out.println("Printing the value of sb : " +sb);

        sb.append(" how ");
        sb.append("are");
        System.out.println("Printing the value of sb : " +sb);

        System.out.println("Reversing a value from String buffer : " + sb.reverse());

        System.out.println(" String buffer capacity : " +sb.capacity());

        StringBuffer sb1 = new StringBuffer();
        sb.append("asgas");

    }
}
