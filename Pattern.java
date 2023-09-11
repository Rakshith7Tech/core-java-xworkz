package com.xworkz.assignment1;

public class Pattern {
    public static void main(String[] args) {
        int size=3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int size1=2;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
