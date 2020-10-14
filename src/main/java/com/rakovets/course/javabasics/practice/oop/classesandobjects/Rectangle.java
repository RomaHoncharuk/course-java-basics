package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    private Point first;
    private Point second;

    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
    }
    public Point getFirstPoint() {
        return first;
    }
    public void setFirstPoint(Point first) {
        this.first = first;
    }
    public Point getSecondPoint() {
        return first;
    }
    public void setSecondPoint(Point second) {
        this.second = second;
    }
    public int getPerimetr() {
        int perimetr = (Math.abs(first.getX() - second.getX()) + Math.abs(first.getY() - second.getY())) * 2;
        return perimetr;
    }
    public int getArea() {
        int area = ((Math.abs(first.getX() - second.getX())) * (Math.abs(first.getY() - second.getY())));
        return area;
    }


}
