package com.rakovets.course.javabasics.practice.exceptionhandling;


import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.GoException;

public class Task4 {
    public static void main(String[] args) {
        GoTask4 goTask4 = new GoTask4(100, true);

        try {
            goTask4.hitpoinsHero2(50);
        } catch (GoException e) {
            e.printStackTrace();
            System.out.print(e.getPrint());
        }
    }
}
