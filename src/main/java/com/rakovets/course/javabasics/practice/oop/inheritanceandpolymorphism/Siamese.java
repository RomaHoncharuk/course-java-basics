package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-150);
        return "mayaya";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(150);
        return "myryr";
    }
}
