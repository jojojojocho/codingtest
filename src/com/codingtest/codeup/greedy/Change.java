package com.codingtest.codeup.greedy;

import java.util.Scanner;

public class Change {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int cnt =0;

        int[] bills = {50000,10000,5000,1000,500,100,50,10};
        for (int bill : bills) {
            int mok=price/bill;
            int nameoji=price % bill;
            price = nameoji;
            cnt+=mok;
        }
        System.out.println(cnt);
        }
}
