package com.arcagile.JavaTraining.training.abstraction;

public class BiCycle implements VehicleInterface {

    @Override
    public void startEngine() {
        System.out.println("i am inside startEngine method of BiCycle");
    }

    @Override
    public void applyGears() {
        System.out.println("i am inside applyGears method of BiCycle");
    }

    @Override
    public void getSpeed() {
        System.out.println("i am inside getSpeed method of BiCycle");
    }
}
