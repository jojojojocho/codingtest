package com.codingtest.programmers.level2;

public class test {
    public static void main(String[] args) {
        String s = "010-0000-0000";
        System.out.println(s.replaceAll("^01(0|1|[6-9])-(\\d{3}|\\d{4})-\\d{4}$","9"));

    }
}
