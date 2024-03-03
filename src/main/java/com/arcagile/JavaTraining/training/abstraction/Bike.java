package com.arcagile.JavaTraining.training.abstraction;

public class Bike implements  VehicleInterface {
    @Override
    public void startEngine() {
        System.out.println("i am inside startEngine method of Bike");
    }

    @Override
    public void applyGears() {
        System.out.println("i am inside applyGears method of Bike");
    }

    @Override
    public void getSpeed() {
        System.out.println("i am inside getSpeed method of Bike");
    }
}
