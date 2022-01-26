package com.codingtest.codeup.recursion;

import java.util.Scanner;

public class BinaryConversion {

    public static void recursion(int n){
        if(n==0){
            System.out.print("0");
            return;
        }else if(n==1){
            System.out.print("1");
        }else{
            recursion(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        recursion(a);
    }
}
