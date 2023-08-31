package com.xworkz.travelapp;

public class Tester2 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        String str[]=new String[2];
        //ArrayIndexOutOfBoundsException
        try {
            str[0]="Raja";
            str[1]="Rani";
            str[2]="Baby";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The no of elements should not be more than the given size");
        }
        System.out.println("Main Ended");
    }
}
