package com.codingtest.codeup.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigInteger;

//3720 : nCr (Hell)
public class NcrHell {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int nSubr= n-r;

        BigInteger bunja = BigInteger.ONE;


        for (int i =1; i<=n;i++) {
            bunja = bunja.multiply(BigInteger.valueOf(i));
            if((i)==r || (i) == nSubr) {
                bunja = bunja.divide(bunja);
            }
        }



        bunja=bunja.remainder(BigInteger.valueOf(1999));
        System.out.println(bunja);
    }
}
