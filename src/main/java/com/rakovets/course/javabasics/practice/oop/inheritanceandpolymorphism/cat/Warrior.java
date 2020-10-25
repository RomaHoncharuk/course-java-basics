package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

public class Warrior extends Hero{
    private Warrior (String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.print("atatata");
    }
}
