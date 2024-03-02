package training.polymorphism;

public class IndividualBankImplementation {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("SBI Rate of Interest : " + sbi.getRateOfInterest());

        ICICI icici = new ICICI();
        System.out.println("ICICI Rate of Interest : " + icici.getRateOfInterest());

    }
}
