package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-70);
        return "mayka";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(70);
        return "xrrrr";
    }
}
