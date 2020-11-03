package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.AccountExeptions;

public class AccountTask3 {
    private int damage;
    private boolean stateHero;

    public AccountTask3 (int damage, boolean stateHero) {
        this.damage = damage;
        this.stateHero = stateHero;
    }

    public void hitponsHero (int damage) throws AccountExeptions {
        if (stateHero) {
            throw new AccountExeptions();
        }
        this.damage -= damage;
        System.out.print("You Hero whit damage");
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public boolean getStateHero() {
        return stateHero;
    }

    public void setStateHero(boolean stateHero) {
        this.stateHero = stateHero;
    }

}
