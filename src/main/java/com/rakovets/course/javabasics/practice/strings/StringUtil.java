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

    public String trimLowString(String str) {
        str = str.trim();
        return str.toLowerCase();
    }

    public String subStringFormat(String str) {
        return str.substring(9,32);
    }

    public String goSmile(String str) {
        return str.replace("(", ")");
    }

    public boolean startEndString(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

}
