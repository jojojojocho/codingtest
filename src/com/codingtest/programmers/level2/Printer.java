package com.codingtest.programmers.level2;
//프린터

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    static class Prior {
        private int index;
        private int priority;

        public Prior(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        public int getIndex() {
            return index;
        }

        public int getPriority() {
            return priority;
        }
    }
    public int solution(int[] priorities, int location) {

        Queue<Prior> queue = new LinkedList<>();
        int index=0;

        for (int priority : priorities) {
            queue.offer(new Prior(index,priority));
            index++;
        }

        Arrays.sort(priorities);
        int cnt=1;

        for (int i =priorities.length-1; i>=0; i--){

            while (!queue.isEmpty()){
                Prior prior = queue.poll();
                if(priorities[i] == prior.getPriority()){
                    if(location==prior.getIndex()){
                        return cnt;
                    }
                    cnt++;
                    break;
                }else{
                    queue.offer(new Prior(prior.getIndex(),prior.getPriority()));
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        int solution = printer.solution(new int[]{2, 1, 3, 2}, 1);
        System.out.println("solution = " + solution);
    }
}
