package com.bridgelabz.day3arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i < size; i++)
            array[i] = scanner.nextInt();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
