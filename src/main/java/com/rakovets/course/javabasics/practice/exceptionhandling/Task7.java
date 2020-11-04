package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.AccountExeptions;

public class Task7 {
    public static void main(String[] args) throws AccountExeptions {
        try {
            lotoGo();
        } catch (AccountExeptions e) {
            System.out.println("Very good");
        } finally {
            System.out.println("Please again");
        }
    }

    public static void lotoGo() throws AccountExeptions {
        int random = (int) Math.round(Math.random());
        if (random == 0) throw new AccountExeptions();
    }
}
