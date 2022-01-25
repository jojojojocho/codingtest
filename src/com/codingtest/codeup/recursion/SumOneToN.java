package com.codingtest.codeup.recursion;

import java.util.Scanner;
//1부터 n까지 역순으로 출력하기
public class SumOneToN {

    public static int recursion(int n, int sum){
        if (n<1){
            return sum;
        }else{
            sum+=n;
            sum=recursion(n-1,sum);
            return sum;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int recursion=recursion(n,0);
        System.out.println(recursion);

    }
}
