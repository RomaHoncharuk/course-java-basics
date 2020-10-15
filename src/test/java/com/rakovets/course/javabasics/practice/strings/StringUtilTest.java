package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void getUpperCaseTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("QWE123RTY", stringUtil.getUpperCase("qwe123rty"));
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCase("QweRty"));
        Assertions.assertEquals("QWE RTY", stringUtil.getUpperCase("QWE RTY"));
        Assertions.assertEquals("", stringUtil.getUpperCase(""));
    }

    @Test
    void getLowerCaseTest() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("QWE123RTY", stringUtil.getUpperCase("qwe123rty"));
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCase("QweRty"));
        Assertions.assertEquals("QWE RTY", stringUtil.getUpperCase("QWE RTY"));
        Assertions.assertEquals("", stringUtil.getUpperCase(""));
    }
}
