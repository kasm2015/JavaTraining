package com.arcagile.JavaTraining.training.abstraction;

public class FourWheeler extends Vehicle {
    @Override
    void getEngineDetails() {
        System.out.println("I am inside getEngineDetails method of FourWheeler class");
    }

    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.getEngineDetails();
    }

}
