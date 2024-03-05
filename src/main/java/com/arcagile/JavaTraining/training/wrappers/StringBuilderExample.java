package com.arcagile.JavaTraining.training.wrappers;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        sb.append(" world");
        System.out.println("String Builder value : " +sb);

        System.out.println("find sub string : " +sb.substring(1, 7));

        System.out.println("find length : " +sb.length());

        Exception ex = new Exception();
        Error error = new Error();
        Object obj = new Object();
    }
}
