package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] array = new int [8];
            array[9] = 9;
            System.out.print(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is FULL");
        }

    }
}
