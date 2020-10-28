package com.rakovets.course.javabasics.practice.generics;

public final class PairUtil {

    public static Pair swap(Pair pair) {
        return new Pair(pair.getValue(), pair.getKey());
    }
}
