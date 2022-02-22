package com.codingtest.programmersschool.week1;

import java.util.*;

public class test{

    public static int solution(int[] budgets, int M) {
        int answer = 0;
        int max=-1, sum=0;
        for(int i=0;i<budgets.length;i++)	{
            if(budgets[i]>max) {
                max=budgets[i];
            }
            sum=sum+budgets[i];
        }
        if(sum<=M)	return max;

        int avg = sum/budgets.length;
        boolean lastState = (func(budgets, avg)>M ? false : true);

        int fResult = -1;
        while(true) {
            fResult = func(budgets, avg);
            if(fResult>M) {	//넘으면 현재 상태는 false
                if(lastState!=false) {
                    answer=avg-1;
                    break;
                }
                avg--;
            }else {	//안넘어서 현재 상태는 true
                if(lastState!=true) {
                    answer=avg;
                    break;
                }
                avg++;
            }
        }
        return answer;
    }

    //상한가 max를 고려한 총 예산 배정액
    public static int func(int[] budgets, int max) {
        int sum=0;
        for(int i=0;i<budgets.length;i++) {
            if(budgets[i]>max) {
                sum=sum+max;
            }else {
                sum=sum+budgets[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int[] budgets=new int[M];
        for ( int i =0; i<M; i++){
            budgets[i]=sc.nextInt();
        }
        System.out.println(solution(budgets,M));
    }
}
