package com.xworkz.travelapp;

import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Main Started");
        String str=null;
        //NullPointerException
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Length cannot be null");
        }
        System.out.println("Main Ended");
    }
}
