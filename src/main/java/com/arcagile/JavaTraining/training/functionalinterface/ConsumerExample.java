package com.arcagile.JavaTraining.training.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerExample {

    static void printMessage(String name ) {
        name = "Kumar";
        System.out.println("Hello ," +name);
    }

    static void printPersonAge(int age) {
        System.out.println("Person Age : " +age);
    }

    static void addNosFromList(List<Integer> list) {
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all the integers --> " +result);
    }


    public static void main(String[] args) {

        Consumer<String> consumer1 = ConsumerExample::printMessage;
        consumer1.accept("John");

        Consumer<Integer> consumer2 = ConsumerExample::printPersonAge;
        consumer2.accept(25);

        Consumer<List<Integer>> addNosFromList = ConsumerExample::addNosFromList;

        List<Integer> list = Arrays.asList(10,20,30,40,50);
        addNosFromList.accept(list);

        Optional optional;

    }
}
