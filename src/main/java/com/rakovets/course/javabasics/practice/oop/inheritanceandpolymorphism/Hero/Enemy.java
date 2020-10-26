package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero;

public class Enemy {
    public Integer health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
