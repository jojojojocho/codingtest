package com.codingtest.programmers.level4;

import java.util.LinkedList;
import java.util.Queue;

public class RightBraceBfs {
    static class Bfs{
        int open, close;

        public Bfs(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

    public int solution(int n) {
        int answer = 0;
        Queue<Bfs> bfs = new LinkedList<>();

        bfs.offer(new Bfs(0,0));
        while (!bfs.isEmpty()){
            Bfs poll = bfs.poll();

            if(poll.open>n) continue;
            if(poll.open<poll.close) continue;
            if(poll.open==n && poll.close==n){
                answer++;
                continue;
            }

            bfs.offer(new Bfs(poll.open+1,poll.close));
            bfs.offer(new Bfs(poll.open,poll.close+1));
        }


        return answer;
    }

}
