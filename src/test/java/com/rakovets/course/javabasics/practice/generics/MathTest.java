package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void Max() {
        int a = 1;
        int b = 2;
        int c = 3;

    }


    @Test
    public void binarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int num = 4;
        Math bin = new Math();
        int per = bin.binarySearch(array, num);
        Assertions.assertEquals(3, per);

    }
}
