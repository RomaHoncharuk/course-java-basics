package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero;

public class Archer extends Hero {
    private Archer(String name) {
        super (name);
    }

    @Override
    public void attackEnemy () {
        System.out.print("Xrxrxrrx");
    }
}