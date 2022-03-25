package com.codingtest.programmers.level3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Immigration2 {
    static class que{
        long origin;
        long count;
        long now;

        public que(long origin, long count, long now) {
            this.origin = origin;
            this.count = count;
            this.now = now;
        }

        public long getOrigin() {
            return origin;
        }

        public long getNow() {
            return now;
        }

        public long getCount() {
            return count;
        }
    }
    public long solution(int n, int[] times) {
        long answer=0;
        Queue<que> queue = new PriorityQueue<>((o1, o2) -> {
            if(o1.getNow()<o2.getNow()) {
                return -1;
            }else{
                    return 1;
                }
        });
        for(int i =0 ; i<times.length;i++){
            queue.offer(new que(times[i], 1, 0));
        }
        long cnt=0;
        while(cnt<=n+1){
            que poll = queue.poll();
            answer = poll.getNow();
            queue.offer(new que(poll.getOrigin(), poll.getCount()+1, poll.getOrigin()* poll.getCount()));
            cnt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Immigration2 immigration2 = new Immigration2();
        long solution = immigration2.solution(100, new int[]{1, 2,15,20});
        System.out.println(solution);
    }

}
