package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    void Name() {
        String name = "Murzik";
        Cat cat = new Cat(name);
        assertEquals(name, cat.getName());
        name = "Tuzik";
        cat.setName(name);
        assertEquals(name, cat.getName());
    }

    @Test
    void addCats() {
        Persian persian = new Persian("Xvost");
        Siamese siamese = new Siamese("Boria");
        Spxynx spxynx = new Spxynx("Nosatii");
        assertEquals("Xvost", persian.getName());
        assertEquals("Boria", siamese.getName());
        assertEquals("Nosatii", spxynx.getName());
        assertEquals("mayka", persian.mew());
        assertEquals("xrrrr", persian.purr());
        assertEquals("mayaya", siamese.mew());
        assertEquals("myryr", siamese.purr());
        assertEquals("maaaayyaa", spxynx.mew());
        assertEquals("grrrr", spxynx.purr());
    }

    @Test
    void Person(){
        Person person = new Person(10);
        assertEquals(10, person.getHappiness());
        person.setHappiness(70);
        assertEquals(70, person.getHappiness());
        person.setHappiness(500);
        assertEquals(500, person.getHappiness());
    }
}
