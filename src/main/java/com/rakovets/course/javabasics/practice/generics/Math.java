package com.rakovets.course.javabasics.practice.generics;


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
        }

        return maxZnach;
    }
    public int MinArray(int[] array) {
        int minZnach = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minZnach < array[i]) {
                minZnach = array[i];
            }
        }

        return minZnach;
    }

    public void SortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int positionOfMin = i;
            for (int j = positionOfMin + 1; j < array.length; j++) {
                if (array[j] < array[positionOfMin]) {
                    positionOfMin = j;
                }
            }

            int tmp = array[i];
            array[i] = array[positionOfMin];
            array[positionOfMin] = tmp;
        }

         //return array;
    }

    public int binarySearch(int[] array, int num) {
        return binarySearch(array, 0, array.length - 1, num);
    }
    private int binarySearch(int[] array, int left, int right, int num) {
        if (left == right || left + 1 == right) {
            if (array[left] == num) {
                return left;
            }
            if (array[right] == num) {
                return right;
            }
            return -1;
        }
        int middleIndex = (right + left) / 2;
        int znachenie = array[middleIndex];
        if (znachenie == num) {
            return middleIndex;
        }
        if (znachenie < num) {
            return binarySearch(array, middleIndex, right, num);
        }else {
            return binarySearch(array, left, middleIndex, num);
        }

    }
}