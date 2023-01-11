package com.bridgelabz.day3arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array Size :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements : ");
        for ( int i = 0 ; i < size ; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is:: "+array[size-2]);
    }
}
