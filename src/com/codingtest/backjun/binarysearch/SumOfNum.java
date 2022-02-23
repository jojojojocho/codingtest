package com.codingtest.backjun.binarysearch;

import java.util.Scanner;

//1789 수들의 합
public class SumOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long S = sc.nextLong();
        Long sum=0L;
        int cnt=0;
        while(sum<=S){
            cnt++;
            sum+=cnt;
        }
        System.out.println(cnt-1);

    }

}
