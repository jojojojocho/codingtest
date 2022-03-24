package com.codingtest.programmers.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//입국심사
public class Immigration {

    public long solution(int n, int[] times) {
        int start = 0;
        int end = times[0]*n;
        int sum = 0;
        int i=0;
        for (int time : times) {
             i= time / end;
            sum+=i;
        }
        if(sum>n){
            end=(start+end)/2-1;
        }else if(sum==n){
        }else{

        }

    }

    public static void main(String[] args) {
        Immigration immigration = new Immigration();
        long solution = immigration.solution(6, new int[]{7, 10});
        System.out.println(solution);
    }
}
