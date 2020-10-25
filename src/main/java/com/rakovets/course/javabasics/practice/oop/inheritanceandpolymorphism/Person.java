package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    public int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int percentHappiness) {
        return happiness += percentHappiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }
}
