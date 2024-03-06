package com.arcagile.JavaTraining.training.collection;

import com.arcagile.JavaTraining.training.exceptions.UserException;

import java.util.*;

public class ListExample {

    public static void main(String[] args) throws Exception {

        //List will allow you add to duplicate element in an ordered list
        List arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("1251");
        arrayList.add(true);
        arrayList.add(10000.0);
        arrayList.add(100);
        arrayList.add("1251");

        System.out.println("1. Arraylist with duplicate elements : " +arrayList);
        //removing an element by index
        arrayList.remove(0);

        System.out.println("2. Arraylist after removing element element from 0th index : " +arrayList);
        //arrayList.remove(4);
        //remove an element by value
        Integer a = 100;
        arrayList.remove(a);
        System.out.println("3. Arraylist after removing element element by value : " +arrayList);

        System.out.println("======Usage of Contains method ======");
        //boolean result = arrayList.contains(100);
        boolean result = arrayList.contains("1251");
        System.out.println("Operation using contains method : " +result);


        System.out.println("======Iterating through a list======");
        for ( Object list1 : arrayList ) {
            System.out.println("Value from list : " +list1.toString());
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Syed");
        stringList.add("Sujith");
        stringList.add("Rahul");
        stringList.add("Kumar");
        stringList.add("Rajani");
        stringList.add("Rajesh");


        //Checking a value is present or not
        String name = "Rajesh";
        System.out.println("Rajesh is present or not : " +stringList.contains(name));

        //Iterate through a element check whether a value exist or not , if it is not present through Exception
        String nameExist = "Rajesh";
        boolean isValueExist = false;
        //One way of approach to the above problem
        boolean strValueExist = stringList.contains(nameExist);
        System.out.println("strValueExist ---> " +strValueExist);
        if(strValueExist) {
            System.out.println("Value exist in the string list ");
        } else {
           throw new UserException("THe given value is not present in the list : " +nameExist);
        }

        System.out.println("======Iterating through a list======");
        for ( String list1 : stringList ) {

            System.out.println("Value from stringList : " +list1.toString());
        }

        System.out.println("Arraylist of String with duplicate elements : " +stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(135);
        integerList.add(132);
        integerList.add(313);
        integerList.add(12);
        integerList.add(10);


        System.out.println("Arraylist of Integer with duplicate elements : " +integerList);
        //Boolean , Double, FLoat, Long

        List<String> linkedList = new LinkedList();
        linkedList.add("abc");
        linkedList.add("asas");
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add("abc");

        System.out.println("Linked list : " +linkedList + " , Size of linkedlist : " +linkedList.size());
        for (int i =0; i < linkedList.size(); i++ ) {
            System.out.println("Index : " +i+ ", Value " +linkedList.get(i));
        }

        //Creating an empty list
        LinkedList linkedList1 = new LinkedList();
        System.out.println("linkedList.isEmpty() --> " +linkedList1.isEmpty());

    }
}
