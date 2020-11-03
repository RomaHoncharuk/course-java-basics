package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.AccountExeptions;

public class AccountTask3 {
    private int damage;
    private boolean heroNullPoint;

    public AccountTask3 (int damage, boolean heroNullPoint) {
        this.damage = damage;
        this.heroNullPoint = heroNullPoint;
    }

    public void hitpoinsHero (int damage) throws AccountExeptions {
        if (heroNullPoint) {
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
        return heroNullPoint;
    }

    public void setStateHero(boolean stateHero) {
        this.heroNullPoint = heroNullPoint;
    }

}
