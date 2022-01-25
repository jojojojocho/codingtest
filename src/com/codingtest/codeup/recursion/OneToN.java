package com.codingtest.codeup.recursion;

import java.util.Scanner;
//1905
//(재귀함수) 1부터 n까지 합 구하기
public class OneToN {
    public static void recursion(int n){
        if (n<1){
            return;
        }else{
            System.out.println(n);
            recursion(n-1);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        recursion(n);

    }
}
