package com.xworkz.travelapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        //InputMisMatchException
        try {
            int name=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("nextInt method accepts only int data");
        }
        System.out.println("Main Ended");
    }
}
