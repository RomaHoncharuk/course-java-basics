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

import java.util.Scanner;

public class Array <T> {
    private Object[] array;

    public void Array(int length) {
        this.array = new Object[length];
    }
    public void keyNum() {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

    }



}
