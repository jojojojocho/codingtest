package com.codingtest.programmersschool.week1;

import java.lang.reflect.Array;
import java.util.*;

public class Budget {

    public static int solution(int[] budgets, int M) {
        Arrays.sort(budgets);
        int sum = M;
        int avg = sum / budgets.length;
        int index = 0;

        for (int i = 0; i < budgets.length; i++) {
            if (avg < budgets[i]) {
                index = i;
            }
        }
        int biggerCnt = budgets.length - index;
        for (int i = 0; i < index; i++) {
            sum -= budgets[i];
        }
        return sum / biggerCnt;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] budgets = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            budgets[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int lastM = M;


        Arrays.sort(budgets);
        int sum = Arrays.stream(budgets).sum();
        int avg = sum / budgets.length;
        int index = 0;
        int frontSum = 0;
        for (int i = 0; i < budgets.length; i++) {
            if (avg < budgets[i]) {
                index = i;
                break;
            }
            frontSum += budgets[i];
        }
        int biggerCnt = budgets.length - index;
        for (int i = 0; i < index; i++) {
            M -= budgets[i];
        }
        int finalAvg = M / biggerCnt;
        while (true) {
            if (frontSum + (finalAvg * biggerCnt) >= lastM){
                finalAvg++;
            }else{
                break;
            };
        }
        System.out.println(finalAvg);
    }


}
