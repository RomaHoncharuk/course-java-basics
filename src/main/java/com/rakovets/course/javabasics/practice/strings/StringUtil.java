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

    public boolean getStartEndStr(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    public int getHowLetter(String str) {
        int let = 0;
        char[] array = new char[]{'a','i','o','O','A','I'};
        for (char ch : str.toCharArray()) {
            for (char ch2 : array) {
                if (ch == ch2) {
                let++;
                }
            }
        }
        return let;
    }

    public int getHowSign(String str) {
        int sign = 0;
        char[] array = new char[]{'.',',','!'};
        for (char ch : str.toCharArray()) {
            for (char ch2 : array) {
                if (ch == ch2) {
                    sign++;
                }
            }
        }
        return sign;
    }
}
