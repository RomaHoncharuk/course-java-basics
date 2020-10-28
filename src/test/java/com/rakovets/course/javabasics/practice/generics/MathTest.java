package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void Max() {
        int a = 1;
        int b = 2;
        int c = 3;
        Math bin = new Math();
        int per = bin.Max(a, b , c);
        Assertions.assertEquals(3,per);
    }

    @Test
    public void Min() {
        int a = 6;
        int b = 2;
        int c = 7;
        int d = 1;
        int z = 8;
        Math bin = new Math();
        int per = bin.Min(a, b , c, d, z);
        Assertions.assertEquals(1,per);
    }
     @Test
     public void  Avg() {
         int[] array = {1, 2, 3, 4, 5};
         Math bin = new Math();
         float per = bin.Avg(array);
         Assertions.assertEquals(3, per);
         int[] array1 = {9, 8, 7, 6, 5};
         float per1 = bin.Avg(array1);
         Assertions.assertEquals(7, per1);
     }

     @Test
     public void MaxArray() {
        int[] array = {3, 6, 5, 1, 4, 8};
        Math bin = new Math();
        int per = bin.MaxArray(array);
        Assertions.assertEquals(8, per);
     }

     @Test
     public void MinArray() {
        int[] array = {7, 9, 9, 45, 4, 8};
        Math bin = new Math();
        int per = bin.MinArray(array);
        Assertions.assertEquals(4, per);
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
