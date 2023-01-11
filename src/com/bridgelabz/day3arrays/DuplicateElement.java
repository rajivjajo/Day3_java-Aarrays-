package com.bridgelabz.day3arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 5, 3, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
