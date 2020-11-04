package com.rakovets.course.javabasics.practice.exceptionhandling.exeption;

public class ReplacementException extends Exception{
    private String print1;
    public ReplacementException(String print1) {
       this.print1 = print1;
    }
    public String getPrint1() {
        return print1;
    }
}
