package com.bridgelabz.day3arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
