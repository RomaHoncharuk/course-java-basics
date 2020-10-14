package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TestPoint {
    public static void main(String[] args) {
        Point koordinati = new Point(6, 7);
        Point koordinati2 = new Point(9, 4);

        System.out.print("Distance - " + koordinati2.distance(koordinati));
    }
}
