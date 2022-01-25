package com.codingtest.codeup.recursion;

import java.util.Scanner;

public class Fibo {
    public static int recursion(int a,int b, int m,int n){
        if (n==1 || n==2){
            return 1;
        }
        if (m ==n){
            return b;
        }else{
            int temp;
            temp=a;
            a=b;
            b=temp+b;
            m++;
            b=recursion(a,b,m,n);
            return b;
        }
        

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a = recursion(1,1,2,n);
        System.out.println(a);
    }
}

