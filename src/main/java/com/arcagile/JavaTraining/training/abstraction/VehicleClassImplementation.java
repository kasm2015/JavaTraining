package com.arcagile.JavaTraining.training.abstraction;

public class VehicleClassImplementation {

    public static void main(String[] args) {

        BiCycle biCycle = new BiCycle();
        biCycle.applyGears();
        biCycle.startEngine();
        biCycle.getSpeed();

        Bike bike = new Bike();
        bike.startEngine();
        bike.applyGears();
        bike.getSpeed();
    }
}
