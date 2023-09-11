package com.xworkz.assignment1;

public class ReverseMoreWord {
    public static void main(String[] args) {
        String sentence = "The more you Learn, the more you Earn";
        String reverseWord = "more";

        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(reverseWord)) {
                reversedSentence += "erom ";
            } else {
                reversedSentence += words[i] + " ";
            }
        }
        System.out.println(reversedSentence);
    }
}
