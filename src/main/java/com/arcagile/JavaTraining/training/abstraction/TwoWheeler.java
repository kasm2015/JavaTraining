package com.arcagile.JavaTraining.training.abstraction;

public class TwoWheeler extends  Vehicle {

    @Override
    void getEngineDetails() {
        System.out.println("i am inside getEngineDetails of TwoWheeler class");
    }

    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.getEngineDetails();
    }

}
