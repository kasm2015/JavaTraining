package com.arcagile.JavaTraining.training.encapsulation;

public class PersonImpl {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Rahul");
        person.setAge(35);
        person.setAddress("St Johns Road");

        System.out.println("Person Name : " +person.getName());
        System.out.println("Person Age : " +person.getAge());
        System.out.println("Person Address : " +person.getAddress());
    }
}
