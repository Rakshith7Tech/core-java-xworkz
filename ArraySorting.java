package com.xworkz.assignment1;

public class ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {36, 77, 45, 24};

        sortAscending(numbers);
        System.out.println("Ascending order");
        array(numbers);

        sortDescending(numbers);
        System.out.println("Descending order ");
        array(numbers);
    }

    public static void sortAscending(int arr[]){
        for(int i =0; i< arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void sortDescending(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void array(int arr[]){
        for (int i:arr){
            System.out.println(i+"");
        }
    }
}
