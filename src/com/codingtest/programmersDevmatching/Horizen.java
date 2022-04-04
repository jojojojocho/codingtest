package com.codingtest.programmersDevmatching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Horizen {
    static class Distance{
        int now;
        int zero;
        List<Integer> list = new ArrayList<>();

        public Distance(int now, int zero, List<Integer> list) {
            this.now = now;
            this.zero = zero;
            this.list = list;
        }

        public int getNow() {
            return now;
        }

        public int getZero() {
            return zero;
        }

        public List<Integer> getList() {
            return list;
        }
    }

    public int[][] solution(int[][] dist) {
        Queue<Distance> q = new LinkedList<>();
        q.offer(new Distance(0,0, new ArrayList<>()));
        //1.좌표 이동 후 큐에 넣기
        for (int i = 0; i < dist.length-1; i++) {
            Distance poll = q.poll();
            int plus = poll.getNow() + dist[i][i + 1];
            int minus = poll.getNow() - dist[i][i + 1];

            if(plus == dist[0][i+1]){
                List<Integer> listp = poll.getList();
                listp.add(plus);
                q.offer(new Distance(plus,dist[0][i], listp));
            }
            if(minus == dist[0][i+1]){
                List<Integer> listm = poll.getList();
                listm.add(minus);
                q.offer(new Distance(minus,dist[0][i],listm));
            }
            if(q.size()>1){
                i=i--;
            }
        }
        //2.꺼내서  또 좌표 이동 후 0과의 기준으로 비교해서 해당 되는 것만 넣기
        //3. 반복

        int[][] answer = {};

        return answer;
    }
}
