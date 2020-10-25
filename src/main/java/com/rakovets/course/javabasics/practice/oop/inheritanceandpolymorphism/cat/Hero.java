package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

import java.awt.*;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.print("atttak");
    }
    public String getName() {
        return name;
    }
}
