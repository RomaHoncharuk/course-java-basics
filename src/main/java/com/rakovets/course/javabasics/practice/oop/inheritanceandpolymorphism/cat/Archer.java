package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

public class Archer extends Hero {
    private Archer(String name) {
        super (name);
    }

    @Override
    public void attackEnemy () {
        System.out.print("Xrxrxrrx");
    }
}
