package com.xworkz.assignment1;

import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split(" ");

        int wordCount = words.length;

        System.out.println("Number of words in the sentence: " + wordCount);
    }
}