package com.codingtest.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

//더 맵게
public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        // 섞은 횟수
        int cnt=0;

        //스코빌 큐에 담기
        for (int food : scoville) {
            pQueue.offer(food);
        }

        //돈다
        while(pQueue.size()>=2) {
            int one = pQueue.poll();
            int two = pQueue.poll();
            if(one<K || two<K){
                if(one<two) {
                    one = one + (two * 2);
                    pQueue.offer(one);
                }
                else {
                    one = two + (one * 2);
                    pQueue.offer(one);
                }
                cnt++;
            }
            else{
                return cnt;
            }
        }
        if (pQueue.peek()<K)
            return -1;
        else
            return cnt;

    }

    public static void main(String[] args) {
        MoreSpicy moreSpicy = new MoreSpicy();
        int solution = moreSpicy.solution(new int[]{1,59}, 50);
        System.out.println(solution);
    }


}
