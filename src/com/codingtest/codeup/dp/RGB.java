package com.codingtest.codeup.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//3803 : RGB 거리
public class RGB {
    //RGB 저장 할 것


    public static int recursion(int n , int color,int [][] cost,int [][] dp){
        int red = 0;
        int green =1;
        int blue=2;
        if (n == 1){
            dp[n-1][color]=cost[n-1][color];
        }

        if (dp[n-1][color] == 0){ //empty dp가 비어있으면
            if (color==red){
                dp[n-1][red]=Math.min(recursion(n-1,1,cost,dp),recursion(n-1,2,cost,dp))+cost[n-1][red];
            }
            if (color==green){
                dp[n-1][green]=Math.min(recursion(n-1,0,cost,dp),recursion(n-1,2,cost,dp))+cost[n-1][green];
            }
            if (color==blue){
                dp[n-1][blue]=Math.min(recursion(n-1,0,cost,dp),recursion(n-1,1,cost,dp))+cost[n-1][blue];
            }

        }

        return dp[n-1][color];
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] dp = new int[n][3];
        for (int i=0; i<n ; i++){
            for (int j = 0; j<3; j++){
                dp[i][j] = scanner.nextInt();
            }
        }


        int [][] emptyDp =new int [n][3];
        System.out.println(Math.min(
                Math.min(recursion(n,0,dp,emptyDp),recursion(n,1,dp,emptyDp)),
                recursion(n,2,dp,emptyDp)  ));








    }
}