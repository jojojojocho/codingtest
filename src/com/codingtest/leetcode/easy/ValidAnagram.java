package com.codingtest.leetcode.easy;


//242. Valid Anagram

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
//        String[] sArr = s.split("");
//        String[] tArr = t.split("");

//        Arrays.sort(sArr);
//        Arrays.sort(tArr);

        Arrays.sort(c1);
        Arrays.sort(c2);


        for (int i = 0; i < t.length(); i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Boolean tr = isAnagram(new String("rat"), new String("cat"));
    }
}
