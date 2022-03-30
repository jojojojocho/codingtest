package com.codingtest.programmers.level3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Network {

    public int solution(int n, int[][] computers) {

        //큐
        Queue<Integer> que = new LinkedList<>();

        //방문여부
        int[] visit = new int[n];

        //카운트
        int cnt =0;

        for(int i =0; i<n; i++) {

            if (visit[i] == 0) {
                que.offer(i);

                while (!que.isEmpty()) {
                    Integer poll = que.poll();

                    if (visit[poll] ==0) {
                        for (int j = 0; j < n; j++) {
                            if (computers[poll][j] == 1 && poll != j)
                                que.offer(j);
                        }
                        visit[poll] = 1;
                    }
                }
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Network network = new Network();
        int solution = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        System.out.println(solution);
    }
}
