package training.polymorphism;

public class SBI extends Bank {


    @Override
    public  Integer getRateOfInterest() {
        System.out.println("I am inside getRateOfInterest of SBI class");
        return 8;
    }

}
