package com.arcagile.JavaTraining.training.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(7);
        treeSet.add(9);

        System.out.println("Tree sett values : " +treeSet);

        //convert a list to Treeset
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pomogranite");
        fruits.add("Orange");

        System.out.println("Printing list of fruits " +fruits);

        TreeSet<String> fruitsWithTreeSet = new TreeSet<>(fruits);
        System.out.println("Printing list of fruits using TreeSet " +fruitsWithTreeSet);



    }

}
