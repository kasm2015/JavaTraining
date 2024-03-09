package com.arcagile.JavaTraining.training.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {


        //hashmap is an implementation of Map interface. It allows only unique keys and allow duplicate values

        HashMap hashMap = new HashMap();
        //adding an element to hashmap
        hashMap.put(1, "Rahul");
        hashMap.put(2, "Rohit");
        hashMap.put(3, "Rajesh");

        System.out.println("Printing hashmap : " +hashMap);
        hashMap.put(4, "Venkat");
        hashMap.put(5, "Srikanth");
        //removing elements from hashmap
        System.out.println("Printing hashmap after adding 2 objects : " +hashMap);
        Object removedObj = hashMap.remove(5);
        System.out.println("Removed Object : " +removedObj.toString());

        System.out.println("Printing hashmap after removing an element  : " +hashMap);

        //Replace an element
        hashMap.replace(3, "Sujith");
        System.out.println("Printing hashmap after replacing an element  : " +hashMap);

        //How to sort the hashmap
        HashMap<Integer,String> employees = new HashMap();
        employees.put(100,"John");
        employees.put(235,"Kane");
        employees.put(212,"Biden");
        employees.put(124,"Mac");
        employees.put(153,"Sarah");

        //Iterator over hashamp
        System.out.println("Iterating through employees hashmap before sorting");
        for ( Map.Entry<Integer,String > employee :  employees.entrySet() ) {
            System.out.println("Employee Key : " +employee.getKey() + ", Employee Value : " +employee.getValue());
            //System.out.println("Employee : " +employee);
        }
    }
}
