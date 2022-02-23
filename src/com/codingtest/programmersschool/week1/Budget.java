package com.codingtest.programmersschool.week1;

import java.lang.reflect.Array;
import java.util.*;

public class Budget {

    public static int solution(int[] budgets, int M, int maxBudget) {


        Arrays.sort(budgets);
        if(Arrays.stream(budgets).sum() < maxBudget){
            return budgets[budgets.length-1];
        }
        int max = budgets[M - 1];
        int min = 0;

        while (true) {

            int avg = (max + min) / 2;
            int sum=0;
            int cnt=0;
            for (int i = 0; i < M; i++) {
                if(budgets[i] <= avg){
                    sum+=budgets[i];
                }else{
                    sum+=avg;
                    cnt++;
                }
            }
            if (sum>maxBudget){
                max=avg-1;
            }else if(sum<maxBudget){
                min=avg+1;
            }else {
                return avg;
            }

            if(max==min){
                return max;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] budgets = new int[M];
        for (int i = 0; i < M; i++) {
            budgets[i] = sc.nextInt();
        }
        int maxBudget = sc.nextInt();
        int solution = solution(budgets, M, maxBudget);
        System.out.println(solution);


    }


}
