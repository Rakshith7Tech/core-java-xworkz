package com.xworkz.assignment1;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 747;
        int reverseNumber = reverse(number);

        System.out.println("Reversed number: " + reverseNumber);

        if(number == reverseNumber){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    public static int reverse(int num){
        int result = 0;

        while(num != 0){
            int reminder = num % 10;               //4 ,
            result  = result * 10 + reminder;      // 4,
            num = num / 10;                        // 45,
        }
        return result;

    }
}
