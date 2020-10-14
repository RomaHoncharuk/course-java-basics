package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    public int numberBanknotes100;
    public int numberBanknotes50;
    public int numberBanknotes20;

    public Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }
    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }
    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }
    public boolean isPosibleIssue(int amount) {
        //boolean firstAnswer;
        //if (amount > (this.numberBanknotes100 + this.numberBanknotes50 + this.numberBanknotes20)) {
        //     firstAnswer = true;
        //}else {
        //    firstAnswer = false;
        //   System.out.print("Insufficient funds at ATM");
        return false;
    }

}
