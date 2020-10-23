package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Spxynx extends Cat {
    public Spxynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "maaaayyaa";
    }

    @Override
    public String purr() {
        return "grrrr";
    }
}
