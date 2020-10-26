package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero.Archer;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero.Hero;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero.Mag;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Hero.Warrior;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {

    @Test
    void Name() {
        Hero hero =new Hero("Tarzan");
        assertEquals("Tarzan", hero.getName());
        Mag mag = new Mag("Boria");
        assertEquals("Boria", mag.getName());
        Warrior warrior = new Warrior("Balbes");
        assertEquals("Balbes", warrior.getName());
        Archer archer = new Archer("Vottakoi");
        assertEquals("Vottakoi", archer.getName());
    }


}
