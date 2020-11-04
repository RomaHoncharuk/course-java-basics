package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.AccountExeptions;

public class Task6 {
    public static void main(String[] args) {
        try {
            threeOptions();
        } catch (ClassCastException | ArithmeticException e) {
            String message = e.toString();
            System.out.println(message);
        } catch (ArrayStoreException e) {
            System.out.println("Incompatible type");
        }
    }

    public static void threeOptions() throws ClassCastException, ArithmeticException, ArrayStoreException {
        int random = (int) Math.floor(Math.random()*3);
        switch (random) {
            case 0: throw new ClassCastException();
            case 1: throw new ArithmeticException();
            case 2: throw new ArrayStoreException();
        }
    }
}
