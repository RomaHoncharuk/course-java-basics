package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Spxynx extends Cat {
    public Spxynx(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-400);
        return "maaaayyaa";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(400);
        return "grrrr";
    }
}
