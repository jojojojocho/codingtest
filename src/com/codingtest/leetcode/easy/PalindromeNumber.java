package com.codingtest.leetcode.easy;

import java.util.Arrays;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String string = String.valueOf(x);



        char[] charArray = string.toCharArray();
        int index = string.length() / 2;
        int j = charArray.length-1;
        for (int i = 0; i < index; i++){
            if(charArray[i] != charArray[j]){
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean answer=isPalindrome(1001);
        System.out.println(answer);
    }

}
