package com.arcagile.JavaTraining.training.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(82);
        linkedHashSet.add(12);
        linkedHashSet.add(32);
        linkedHashSet.add(46);
        linkedHashSet.add(75);

        System.out.println("Printing linkedhash set values : " +linkedHashSet);

        //verify what is the value exist at index 3
        int position = 3;
        int currentIndex = 0;
        Iterator<Integer> iterator = linkedHashSet.iterator();
        System.out.println("==========Printing the values of LinkedHashSet using Iterator ============");
        while (iterator.hasNext()) {
            Integer currentElement = iterator.next();
            //System.out.println("initialCurrentIndex = " + currentIndex+ ", currentElement --> "+currentElement);
            System.out.println("Current Index : " +currentIndex + ", Position : " +position + ", Element at current Index " +currentElement);
            if ( currentIndex == position - 1 ) {
                System.out.println("Element at index " + position + " is : " +currentElement);
                //it will stop the looping from further element
                break;
            }
            currentIndex++;
        }

    }
}
