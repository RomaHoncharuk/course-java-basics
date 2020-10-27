package com.rakovets.course.javabasics.practice.generics;
//Создайте шаблонный класс `Array`, который представляет собой массив, позволяющий хранить объекты заданного типа.
//
//        Необходимо реализовать:
//
//        * заполнение массива с клавиатуры
//        * заполнение массива случайными числами
//        * отображение массива
//        * поиск максимального значения
//        * поиск минимального значения
//        * подсчет среднеарифметического значения
//        * сортировка массива по возрастанию
//        * сортировка массива по убыванию
//        * поиск значения в массиве, используя бинарный поиск
//        * замена значения в массиве на новое значение

import java.util.Random;
import java.util.Scanner;

public class Array <T> {
    private Object[] array;

    public Array(int length) {
        this.array = new Object[length];
    }
    public void keyNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size array:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter element:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
    }

    public int randomNum() {
        Random rand = new Random();
        int randNum = rand.nextInt();
        return randNum;
    }

    public void numRandomArray() {
        int n, array[];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array [i] = randomNum();
        }
    }

    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public String arrayToString() {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s = s + array[i];
        }
        return s;
    }

    public void maxArray () {
        int minZnach = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minZnach < array[i]) {
                minZnach = array[i];
            }
        }

        return minZnach;

    }
}
