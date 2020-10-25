package com.rakovets.course.javabasics.practice.generics;
//=== Specification of task 1
//
//        Реализуйте шаблонный метод, который возвращает максимум из трёх переданных параметров.
//
//        === Specification of task 2
//
//        Реализуйте шаблонный метод, который возвращает минимум из пяти переданных параметров.
//
//        === Specification of task 3
//
//        Реализуйте шаблонный метод для поиска среднеарифметического значения в массиве.
//
//        === Specification of task 4
//
//        Реализуйте шаблонный метод для поиска максимума в массиве.
//
//        === Specification of task 5
//
//        Реализуйте шаблонный метод для поиска минимума в массиве.
//
//        === Specification of task 6
//
//        Реализуйте шаблонный метод для сортировки массива.
//
//        === Specification of task 7
//
//        Реализуйте шаблонный метод для двоичного поискав массиве.


import com.sun.jdi.connect.Connector;

public class Math {

    public int Max(int a, int b, int c) {

        return Max(Max(a, b), c);
    }

    private int Max(int a, int b) {

        return java.lang.Math.max(a, b);
    }

    private int Min(int a, int b) {
        return java.lang.Math.min(a, b);
    }

    public int Min(int a, int b, int c, int d, int z) {
        return Min(Min(Min(Min(a, b), c), d), z);
    }

    public float Avg(int[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should be not null");
        }
        long sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
            sum += array[i][j];
        }
        return sum / array.length;
    }

    public int MaxArray(int[] array) {
        int maxZnach = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxZnach > array[i]) {
                maxZnach = array[i];
            }
            return maxZnach;
    }
    public int MinArray(int[] array) {
         int minZnach = array[0];
         for (int i = 0; i < array.length; i++) {
             if (minZnach < array[i]) {
                 minZnach = array[i];
             }
             return minZnach;
         }
    }

    public int[] SorrtArray(int[] array) {

        }

    }

}
