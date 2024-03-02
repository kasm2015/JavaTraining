package training.polymorphism;

public class MethodOverloadingExample {

    public Integer sum(int a, int b) {
        System.out.println("i am inside sum method with 2 arguments");
        Integer result = a + b;
        return result;
    }

    public Integer sum(int a, int b, int c) {
        System.out.println("i am inside sum method with 3 arguments");
        Integer result = a + b + c;
        return result;
    }

    public Integer sum(int a, int b, int c, int d) {
        System.out.println("i am inside sum method with 4 arguments");
        Integer result = a + b + c + d;
        return result;
    }

    public Double sum(double a, double b) {
        System.out.println("i am inside sum method with 2 arguments having double value");
        Double result = a + b;
        return  result;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        //Other way of calling a method and printing the result
        System.out.println("Sum of 2 numbers  : " +obj.sum(3,5));

        System.out.println("Sum of 3 numbers  : " +obj.sum(3,5,6));

        System.out.println("Sum of 4 numbers  : " +obj.sum(3,5,6, 6));

        System.out.println("Sum of 4 numbers  : " +obj.sum(2.5,3.5));
    }





}
