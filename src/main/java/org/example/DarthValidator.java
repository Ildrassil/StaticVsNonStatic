package org.example;

public class DarthValidator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int substraction(int a, int b){



        return a-b;

    }
    public static Double division(double a, double b){
         if (b == 0) {

            return null;
        }
        return a/b;
    }

}
