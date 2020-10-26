package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero;

public class Warrior extends Hero {
    public Warrior (String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.print("atatata");
    }
}