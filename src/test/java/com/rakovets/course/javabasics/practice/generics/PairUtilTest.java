package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairUtilTest {

     @Test
    void pairUtilTest() {
         Pair<Integer, Double> pair = new Pair(5, 5.5);
         Pair<Double,Integer> swapPair = PairUtil.swap(pair);
         Assertions.assertEquals(5.5, swapPair.getKey());
         Assertions.assertEquals(5, swapPair.getValue());
         Pair<String, Integer> pair1 = new Pair<>("XaXa", 100);
         Pair<Integer, String> swapPair1 = PairUtil.swap(pair1);
         Assertions.assertEquals(100, swapPair1.getKey());
         Assertions.assertEquals("XaXa", swapPair1.getValue());
    }
}
