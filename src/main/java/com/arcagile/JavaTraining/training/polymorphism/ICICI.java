package training.polymorphism;

public class ICICI extends Bank {

    @Override
    Integer getRateOfInterest () {
        System.out.println("I am inside getRateOfInterest of ICICI class");
        return 7;
    }
}
