package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void getGlueString() {
        StringUtil stringUtil = new StringUtil("Cool");
        Assertions.assertEquals("CoolDay", stringUtil.getGlueString("Day"));
        Assertions.assertEquals("Cool123", stringUtil.getGlueString("123"));
        Assertions.assertEquals("Cool_many", stringUtil.getGlueString("_many"));
        Assertions.assertEquals("Cool da!", stringUtil.getGlueString(" da!"));
    }

    @Test
    void getSearchString() {
        StringUtil stringUtil = new StringUtil("MazDai");
        Assertions.assertEquals(-1, stringUtil.getSearchString('e'));
        Assertions.assertEquals(-1, stringUtil.getSearchString('d'));
        Assertions.assertEquals(3, stringUtil.getSearchString('D'));
        Assertions.assertEquals(2, stringUtil.getSearchString('z'));
        Assertions.assertEquals(1, stringUtil.getSearchString('a'));
    }

    @Test
    void getCompareString() {
        StringUtil stringUtil = new StringUtil("NewDoor");
        Assertions.assertEquals(false, stringUtil.getCompareString("newdoor"));
        Assertions.assertEquals(false, stringUtil.getCompareString("New Door"));
        Assertions.assertEquals(false, stringUtil.getCompareString("New.Door"));
        Assertions.assertEquals(false, stringUtil.getCompareString("New_Door"));
        Assertions.assertEquals(true, stringUtil.getCompareString("NewDoor"));
    }
}
