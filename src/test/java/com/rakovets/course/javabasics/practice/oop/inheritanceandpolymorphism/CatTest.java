package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cat.*;
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
        Person person = new Person(1000);
        assertEquals("Xvost", persian.getName());
        assertEquals("Boria", siamese.getName());
        assertEquals("Nosatii", spxynx.getName());
        assertEquals("mayka", persian.mew(person));
        assertEquals("xrrrr", persian.purr(person));
        assertEquals("mayaya", siamese.mew(person));
        assertEquals("myryr", siamese.purr(person));
        assertEquals("maaaayyaa", spxynx.mew(person));
        assertEquals("grrrr", spxynx.purr(person));
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
    @Test
    void catGetHappiness () {
        Person person = new Person(1000);
        Cat cat = new Cat("Baton");
        cat.mew(person);
        assertEquals(900, person.getHappiness());
        cat.purr(person);
        assertEquals(1000, person.getHappiness());
        Persian persian = new Persian("Banderovec");
        persian.mew(person);
        assertEquals(930, person.getHappiness());
        persian.purr(person);
        assertEquals(1000, person.getHappiness());
        Siamese siamese = new Siamese("AGL");
        siamese.mew(person);
        assertEquals(850, person.getHappiness());
        siamese.purr(person);
        assertEquals(1000, person.getHappiness());
        Spxynx spxynx = new Spxynx("Makkkey");
        spxynx.mew(person);
        assertEquals(600, person.getHappiness());
        spxynx.purr(person);
        assertEquals(1000, person.getHappiness());
    }
}
