package com.bridgelabz.day3arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the array elements : ");
        for( int i =0; i < size ; i++)
            array[i] = scanner.nextInt();
        int min = array[0];
        for( int i = 1 ; i < array.length ;i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println( min +" is the smallest element ");
    }
}
