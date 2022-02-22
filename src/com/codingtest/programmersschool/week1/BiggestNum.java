package com.codingtest.programmersschool.week1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiggestNum {

    public String solution(int[] numbers) {

        String collect = IntStream.of(numbers).
                mapToObj(n -> String.valueOf(n)).
                sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        }).collect(Collectors.joining());

        if(collect.startsWith("0"))
            return "0";
        return collect;
    }

    public static void main(String[] args) {

    }

}
