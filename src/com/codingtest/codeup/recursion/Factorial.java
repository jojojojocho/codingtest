package com.codingtest.codeup.recursion;

import java.util.Scanner;

//1912 : (재귀함수) 팩토리얼 계산
public class Factorial {

    public static int recursion(int n){
        if (n<2){
            return n;
        }else{
            return n*recursion(n-1);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int j=scanner.nextInt();
        int a = recursion(j);
        System.out.println(a);




    }
}
