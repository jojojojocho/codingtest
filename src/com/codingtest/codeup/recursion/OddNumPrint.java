package com.codingtest.codeup.recursion;

import java.util.Scanner;

//1904 : (재귀함수) 두 수 사이의 홀수 출력하기
public class OddNumPrint {
    public static void recursion(int a, int b){
        if (a> b) return;
        else if (a<=b){
            recursion(a,b-1);
            if (b%2!=0){
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        recursion(a,b);

    }
}
