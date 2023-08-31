package com.xworkz.travelapp;

public class Tester3 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        int num=35;
        //ArithmeticException
        try {
            int output=num/0;
        }catch (ArithmeticException e){
            System.out.println("The number dividing by zero is not accepted in java");
        }
        System.out.println("Main Ended");
    }
}
