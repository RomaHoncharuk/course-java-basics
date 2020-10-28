package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ArrayTest {

    @Test
    public void numRandomArray() {
    }


    @Test
    public void FindMin() {
        Array<Integer> myCollection = new Array<Integer>();
        myCollection.SetItem(10);
        myCollection.SetItem(7);
        myCollection.SetItem(15);
        myCollection.SetItem(9);
        myCollection.SetItem(1);
        myCollection.SetItem(2);
        Assertions.assertEquals(1, myCollection);
    }



}



