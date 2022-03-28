package com.codingtest.leetcode.easy;

public class CountBits {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for(int i=0; i<=n; i++) {
            String s = Integer.toBinaryString(i);
            String binaryString = s.replaceAll("0", "");
            answer[i] = binaryString.length();
        }
        return answer;
    }

    public static void main(String[] args) {
        CountBits countBits = new CountBits();
        int[] ints = countBits.countBits(64);
        int cnt=0;
        for (int anInt : ints) {
            System.out.println("anInt "+cnt++ +" =" + anInt);
        }
    }
}
