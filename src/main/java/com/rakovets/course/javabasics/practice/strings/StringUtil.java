package com.rakovets.course.javabasics.practice.strings;



public class StringUtil {

    private final String str;

    public StringUtil(String str) {
        this.str = str;
    }

    public String getGlueString(String str) {
        return this.str.concat(str);
    }
    public int getSearchString(char cha) {
        return str.indexOf(cha);
    }
    public boolean getCompareString(String str) {
        return this.str.equals(str);
    }
}
