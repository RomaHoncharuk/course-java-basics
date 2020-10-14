package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSecond) {
        this.hours = totalSecond / 3600;
        this.minutes = totalSecond % 3600 / 60;
        this.seconds = totalSecond % 3600 % 60;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours() {

        return this.hours;
    }
    public void setHours() {

        this.hours = hours;
    }
    public int getMinutes() {

        return this.minutes;
    }

    public void setMinutes() {

        this.minutes = minutes;
    }
    public int getSeconds() {

        return this.minutes;
    }
    public void setSeconds() {

        this.seconds = seconds;
    }
    int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }
}
