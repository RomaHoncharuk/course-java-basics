package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.Person;

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
