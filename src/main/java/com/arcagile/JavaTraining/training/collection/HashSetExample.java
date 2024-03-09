package com.arcagile.JavaTraining.training.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetExample {

    public static void main(String[] args) {

        //HashSet
        //int , boolean, char, long, double, float
        HashSet<String> hashSet = new HashSet();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");

        System.out.println("Hashset values : " +hashSet);

        hashSet.add("Pomogranete");
        hashSet.add("Orange");
        hashSet.add("Dry fruit");
        hashSet.add("Pineapple");

        //Iterate through hash set using lambda expression
        hashSet.forEach( val -> System.out.println(val));

        System.out.println("Printing hashset values using for loop");
        for ( String s : hashSet) {
            System.out.println(s);
        }

        //Traverse over hashset elements using Iterator
        System.out.println("Printing hashset values using iterator");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(19);
        integerHashSet.add(12);
        integerHashSet.add(16);
        integerHashSet.add(25);
        integerHashSet.add(21);
        integerHashSet.add(45);
        integerHashSet.add(65);

        System.out.println("Printing hashset values " +integerHashSet);

        boolean isExist = integerHashSet.contains(1329);
        System.out.println("Is value exist : " +isExist);


        System.out.println("Finding max value from Hashset using Collections " +Collections.max(integerHashSet));
        System.out.println("Finding min value from Hashset using Collections " +Collections.min(integerHashSet));

        //Sorting collections
        //Converting set to list
        List setConvertedTOList =  new ArrayList(integerHashSet);
        Collections.sort(setConvertedTOList);
        Collections.reverse(setConvertedTOList);
        System.out.println("Sorting integer hashset collection using inbuilt method : " +setConvertedTOList);

    }
}
