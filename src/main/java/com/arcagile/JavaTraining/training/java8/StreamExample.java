package com.arcagile.JavaTraining.training.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    private static List<Product> productList = new ArrayList<>();

    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        //How do we create a Stream
        Stream<String> stream = Stream.empty();

        // :: is called Method Reference
        stream.forEach(System.out::println);

        //Create a list
        List<String> list = Arrays.asList("Mango","Apple","Orange","Banana","Pomogranete");

        List<Integer> numbers = Arrays.asList(1,4,6,3,7,9,4,2,1,9,3);

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

        //Using collect method
        calculateTotalSalary();

        //Using distinct() method
        System.out.println("Numbers with Duplicate values : " +numbers);
        List<Integer> distinctValues = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Numbers with distinct values : " +distinctValues);

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

    public static void calculateTotalSalary() {
        //Add employees data
        employeeList.add(new Employee(1, "Rahul",25,"abc street1","HR",20000L));
        employeeList.add(new Employee(2, "Sanjana",45,"abc street1","IT",24000L));
        employeeList.add(new Employee(3, "Venkat",35,"abc street1","HR",25600L));
        employeeList.add(new Employee(4, "Sridhar",27,"abc street1","FINANCE",40000L));
        employeeList.add(new Employee(5, "Rohit",29,"abc street1","IT",30000L));
        employeeList.add(new Employee(6, "Mohan",55,"abc street1","FINANCE",60000L));

        //GEt the total salary being paid to all the employee
        Long totalSalary = employeeList.stream()
                .collect(Collectors.summingLong(employee -> employee.getSalary()));
        System.out.println("Total Salary paid : " +totalSalary);

        //find the min salary
        Employee minSalary = employeeList.stream()
                .min((employee1, employee2) -> employee1.getSalary() > employee2.getSalary() ? 1 : -1).get();
        System.out.println("Employee with min salary : " +minSalary.getSalary());


        //find the max salary
        Employee maxSalary = employeeList.stream()
                .max((employee1, employee2) -> employee1.getSalary()  > employee2.getSalary() ? 1 : -1).get();
        System.out.println("Employee with max salary : " +maxSalary.getSalary());

        //Using map method -> find employee salary greater 25k
        List<Long> salaryGreaterThan25k = employeeList.stream()
                .filter(employee -> employee.getSalary() > 25000L)
                .map(Employee::getSalary) //fetch employee salary
                .toList();

        salaryGreaterThan25k.forEach(System.out::println);

        System.out.println("Employee salary greater than 30k");
        List<Employee> employeeList1 = employeeList.stream()
                .filter(employee -> employee.getSalary() > 30000L)
                .toList();

        employeeList1.forEach(System.out::println);

        //find the first employee who is having salary greater 25k
        System.out.println("Find the first Employee salary greater than 25k");
        Optional<Employee> firstEmployee = employeeList1.stream()
                .filter(employee -> employee.getSalary() > 25000L)
                .findFirst();

        boolean isPresent = firstEmployee.isPresent();
        System.out.println("Is employee found : " +isPresent);
        Employee empObj = firstEmployee.get();
        System.out.println("Employee Details : " +empObj.toString());
    }


}
