package gr.codehub.test;


public class Main {
    
    public static int divide(int numerator, int denominator) {
        if (denominator != 0)
            return numerator / denominator;
        else
            return 0;
    }

    public static int myLuckyNumber() {
        return 1;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World " + myLuckyNumber());
    }
}
