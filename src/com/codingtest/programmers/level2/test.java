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
        test test = new test();
        int recu = test.recu(10);
        System.out.println("recu = " + recu);

    }
}
