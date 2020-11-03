package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.AccountExeptions;

public class Task3 {
    public static void main(String[] args) {
        AccountTask3 accountTask3;
        accountTask3 = new AccountTask3(100, true);
        try {
        accountTask3.hitponsHero(50);
        } catch (AccountExeptions e){
            System.out.print("Your Hero is dead");
        }
    }
}