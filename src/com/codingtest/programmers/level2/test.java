package com.codingtest.programmers.level2;

public class test {
    public int recu(int n){
        if(n==1){
            return 1;
        }else{
            return n+recu(n-1);
        }
    }
    public static void main(String[] args) {
        String s = "s.txt";
        int idx = s.lastIndexOf(".");
        String substring = s.substring(idx);
        System.out.println(substring);

    }
}
