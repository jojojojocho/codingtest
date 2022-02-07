package com.codingtest.codeup.dp;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//3801 : 오르막 수
public class UphillNum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ints = {0,0,0,0,0,0,0,0,0,0};
        int sum=1; //0일 때 1
        for (int i = 0; i<n; i++){

            for(int j=0; j<10; j++) {
                if(j==0)
                    ints[j]=sum;

                else {
                    int temp = ints[j];
                    ints[j] = sum - temp;
                    sum = sum - temp;
                }
            }

            int tem=0;

            for (int anInt : ints) {
                tem+=anInt;
            }
            sum=tem;
        }

        System.out.println(sum);


    }

}
