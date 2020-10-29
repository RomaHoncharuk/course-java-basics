package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {

        String str = null;
        try {
            str.concat("9");
        } catch (NullPointerException e) {
            System.out.print("Not operation");

        }

    }
}
