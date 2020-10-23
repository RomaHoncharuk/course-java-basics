package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    void Name() {
        String name = "Murzik";
        Cat cat = new Cat(name);
        Assertions.assertEquals(name, cat.getName());
        name = "Tuzik";
        cat.setName(name);
        Assertions.assertEquals(name, cat.getName());
    }

    @Test
    void addCats() {
        Persian persian = new Persian("Xvost");
        Siamese siamese = new Siamese("Boria");
        Spxynx spxynx = new Spxynx("Nosatii");
        Assertions.assertEquals("Xvost", persian.getName());
        Assertions.assertEquals("Boria", siamese.getName());
        Assertions.assertEquals("Nosatii", spxynx.getName());
        Assertions.assertEquals("mayka", persian.mew());
        Assertions.assertEquals("xrrrr", persian.purr());
        Assertions.assertEquals("mayaya", siamese.mew());
        Assertions.assertEquals("myryr", siamese.purr());
        Assertions.assertEquals("maaaayyaa", spxynx.mew());
        Assertions.assertEquals("grrrr", spxynx.purr());

    }
}
