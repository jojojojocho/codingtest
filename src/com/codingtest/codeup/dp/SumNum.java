package com.codingtest.codeup.dp;

import java.util.Scanner;

//3707 : 합의 개수
public class SumNum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();

        long sum=0;
        for (int i=0; i <= a-2; i++){
            sum+=  (long)Math.pow(2,i);
        }
        System.out.println( sum);


    }

}
