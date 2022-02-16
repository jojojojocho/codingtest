package com.codingtest.codeup.dp;


import java.math.BigInteger;
import java.util.*;

//3801 : 오르막 수
public class UphillNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        BigInteger[] before = new BigInteger[10];
        BigInteger[] after = new BigInteger[10];
        for(int i=0;i<10;i++){
            before[i]= BigInteger.valueOf(0);
            after[i]= BigInteger.valueOf(0);
        }
        BigInteger sum = BigInteger.valueOf(1); //0일 때 1
        BigInteger beforeSum;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==0) after[j]=sum;

                else {
                    after[j] = sum.subtract(before[j-1]);
                    sum=sum.subtract(before[j-1]);
                }

            }

            BigInteger tem = BigInteger.valueOf(0);
            for (BigInteger anInt : after) {
                tem=tem.add(anInt);
            }

            sum = tem;
            before= Arrays.copyOf(after, after.length);

        }
        beforeSum=sum.remainder(BigInteger.valueOf(10007));
        System.out.println(beforeSum);
    }


}

