package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exeption.GoException;

public class GoTask4 {
    private int damage1;
    private boolean heroNullPoint1;

    public GoTask4 (int damage, boolean heroNullPoint) {
        this.damage1 = damage;
        this.heroNullPoint1 = heroNullPoint;
    }

    public void hitpoinsHero2 (int damage) throws GoException {
        if (heroNullPoint1) {
            throw new GoException("Your Hero is dead");
        }
        this.damage1 -= damage1;
        System.out.print("You Hero whit damage");
    }

    public int getDamage() {
        return damage1;
    }

    public void setDamage(int damage){
        this.damage1 = damage1;
    }

    public boolean getStateHero() {
        return heroNullPoint1;
    }

    public void setStateHero(boolean stateHero) {
        this.heroNullPoint1 = heroNullPoint1;
    }
}
