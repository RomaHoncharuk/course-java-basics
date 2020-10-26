package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero;

public class Mag extends Hero {
    public Mag (String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.print("grgrgr");
    }
}