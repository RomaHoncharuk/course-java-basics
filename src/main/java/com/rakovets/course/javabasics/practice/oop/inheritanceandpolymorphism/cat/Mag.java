package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

public class Mag extends Hero {
    private Mag (String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.print("grgrgr");
    }
}
