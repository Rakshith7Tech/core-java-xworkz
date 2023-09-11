package com.xworkz.assignment1;

public class ArraySum {
    public static void main(String[] args) {
        int numbers[] = {7, 2, 9, 1, 3, 8};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}