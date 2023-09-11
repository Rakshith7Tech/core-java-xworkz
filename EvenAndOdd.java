package com.xworkz.assignment1;

public class EvenAndOdd {
    public static void main(String[] args) {
        // Declare an array of integers
        int numbers[] = {24, 15, 7, 2, 19, 33, 27, 4};

        // Find even and odd numbers in the array
        findEvenAndOdd(numbers);
    }

    public static void findEvenAndOdd(int arr[]) {
        System.out.println("Even numbers:");
        for (int number : arr) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int number : arr) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
