package com.codingtest.programmers.level3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//입국심사
public class Immigration {

    public long solution(int n, int[] times) {
        //오름차 정렬
        Arrays.sort(times);

        //최소
        long start = 0;

        //최대
        long end = (long) times[times.length - 1] * n;

        long mid=0;
        long answer=0;

        //탐색
        while(start<=end){
            long sum = 0;
            //가운데
            mid= (start+end) / 2;

            for (long time : times) {
                sum+= mid / time;
            }
            if(sum < n) {
                start = mid + 1;
            }else  {
                end=mid-1;
                answer=mid;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Immigration immigration = new Immigration();
        long solution = immigration.solution(8, new int[]{1,9});
        System.out.println(solution);
    }
}
