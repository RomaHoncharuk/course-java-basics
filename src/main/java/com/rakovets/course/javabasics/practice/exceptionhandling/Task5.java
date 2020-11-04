package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.ReplacementException;

public class Task5 {
    public static void main(String[] args) {

        try {
            try {
                String str = null;
                str.concat("9");
            } catch (NullPointerException e) {
                throw new ReplacementException(e.getMessage());
            }
        } catch (ReplacementException e) {
            System.out.print("Vrode tak");
        }
    }
}
