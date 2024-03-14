package com.arcagile.JavaTraining.training.java8;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {

        //How do we create a Stream
        Stream<String> stream = Stream.empty();

        // :: is called Method Reference
        stream.forEach(System.out::println);

        //Create a list
        List<String> list = Arrays.asList("Mango","Apple","Orange","Banana","Pomogranete");

        //Create a stream for a above list
        Stream<String> fruits = list.stream();
        //print the elements using stream
        fruits.forEach(System.out::println);

        //long count = fruits.count();
        //System.out.println("Count of Fruits : " +count);

        //Creating a array of Stream in one way
        Stream<String> streamOfArray = Stream.of("Rahul","Rohit","Venkat","Sanjana");
        streamOfArray.forEach(System.out::println);

        //Creating a array of Stream in another way
        String[] array = new String[]{"a","b","c"};
        Stream<String> stringStream = Arrays.stream(array);
        stringStream.forEach(System.out::println);

        //Using Stream Filter operation
        filterOperation();
    }

    public static void filterOperation() {
        //Add Products
        productList.add(new Product(1, "Iphone 11", 25000f));
        productList.add(new Product(2, "Iphone 12", 30000f));
        productList.add(new Product(3, "Iphone 13", 28000f));
        productList.add(new Product(4, "Iphone 14", 32000f));
        productList.add(new Product(5, "Iphone 15", 90000f));

        //Iteratiing productList without stream api
        /*for (Product product : productList ) {
            System.out.println(" Product : " +product.toString());
        }*/

        //Using Stream API Filter method , below -> indicates lambda expression
        productList.stream()
                .filter( product -> product.getPrice() > 30000f )
                .forEach(System.out::println);


        //employeeList.stream().filter(employee -> employee.getDepartment().eqauls("HR"))
        //.forEach(System.out::println);

        //Find employeess who salary is greater than 10k

        //find employee who is having age greater 30
    }


}
