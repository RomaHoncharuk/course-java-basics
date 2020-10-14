package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TestTime {
    public static void main (String[] args) {
        Time vremia = new Time(666666);
        System.out.print("Horse - " + vremia.getHours() + "; Minutes - " + vremia.getMinutes() + "; Seconds - " + vremia.getSeconds());
        vremia.setHours();
        vremia.getMinutes();
        vremia.getSeconds();
        System.out.println("; TotalSecond - " + vremia.getTotalSeconds());
    }
}
