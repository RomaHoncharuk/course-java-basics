package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TestRectangle {
    public static void main(String[] args) {
        Point tochka1 = new Point(3, 4);
        Point tochka2 = new Point(7, 2);
        Rectangle rectig = new Rectangle(tochka1, tochka2);
        System.out.print("Perimetr - " + rectig.getPerimetr() + "; Area - " + rectig.getArea());
    }
}
