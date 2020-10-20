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

    @Test
    void gettrimLowString() {
        StringUtil stringUtil = new StringUtil(" BlaBla ");
        Assertions.assertEquals("blabla", stringUtil.trimLowString(" BlaBla "));
        Assertions.assertEquals("xaxa", stringUtil.trimLowString("XaXA "));
        Assertions.assertEquals("vot123aga", stringUtil.trimLowString("    VoT123aGa "));
        Assertions.assertEquals("todo", stringUtil.trimLowString("todo"));
        Assertions.assertEquals("xa-xa-xi", stringUtil.trimLowString("Xa-xA-XI       "));
        Assertions.assertEquals("pyyyyk", stringUtil.trimLowString("       pYYYYk        "));
    }

    @Test
    void subStringFormat() {
        StringUtil stringUtil = new StringUtil("123456789abcdefghijklmnopqrstuvwxyz");
        Assertions.assertEquals("abcdefghijklmnopqrstuvw", stringUtil.subStringFormat("123456789abcdefghijklmnopqrstuvwxyz"));
        Assertions.assertEquals("abcdefghijklmnopqrs1234", stringUtil.subStringFormat("123456789abcdefghijklmnopqrs1234"));
    }

    @Test
    void goSmile() {
        StringUtil stringUtil = new StringUtil("My frend :) , or:( ?");
        Assertions.assertEquals("My frend :) , or:) ?", stringUtil.goSmile("My frend :) , or:( ?"));
        Assertions.assertEquals("Good day? no :::::)", stringUtil.goSmile("Good day? no :::::("));
        Assertions.assertEquals("Hello :):):):):):)", stringUtil.goSmile("Hello :(:(:(:):(:("));
        Assertions.assertEquals(":),:)", stringUtil.goSmile(":(,:("));
    }

    @Test
    void getStartEndStr() {
        StringUtil stringUtil = new StringUtil("word or word");
        Assertions.assertEquals(true, stringUtil.getStartEndStr("word or word", "word"));
        Assertions.assertEquals(true, stringUtil.getStartEndStr("wordor word", "word"));
        Assertions.assertEquals(false, stringUtil.getStartEndStr("dorw ro dorw", "word"));
    }

    @Test
    void getHowLetter() {
        StringUtil stringUtil = new StringUtil("Babaika");
        Assertions.assertEquals(4, stringUtil.getHowLetter("Babaika"));
        Assertions.assertEquals(3, stringUtil.getHowLetter("Andatra"));
        Assertions.assertEquals(2, stringUtil.getHowLetter("goblin"));
        Assertions.assertEquals(5, stringUtil.getHowLetter("SHMAKODOVILKA"));
    }

    @Test
    void getHowSign() {
        StringUtil stringUtil = new StringUtil("Ho, you? doing! Menn,,, you are....lose");
        Assertions.assertEquals(9, stringUtil.getHowSign("Ho, you? doing! Menn,,, you are....lose"));
    }
}
