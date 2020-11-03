package com.rakovets.course.javabasics.practice.exceptionhandling.exeption;

public class GoException extends RuntimeException{
    private String print;
    public GoException(String print) {
        this.print = print;
    }
    public String getPrint() {
        return print;
    }


}
