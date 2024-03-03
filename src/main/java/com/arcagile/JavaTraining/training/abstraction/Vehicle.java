package com.arcagile.JavaTraining.training.abstraction;

public abstract class Vehicle {

    //It can have abstract and non abstract methods

    //you can declare constructor and static method also

    //abstract method
    abstract void getEngineDetails();

    //non abstract method
    void getVehicleSpecification() {
        System.out.println("i am inside getVehicleSpecification metod of Vehicle class");
    }


}
