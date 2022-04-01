package com.codingtest.programmers.level2;
//타겟넘버

import java.util.Stack;

public class TargetNumber {
    static class Dfs {
        int myIdx;
        int nextIdx;
        int myDepth;
        int myValue;

        public Dfs(int myIdx, int nextIdx, int myDepth, int myValue) {
            this.myIdx = myIdx;
            this.nextIdx = nextIdx;
            this.myDepth = myDepth;
            this.myValue = myValue;
        }

        public int getMyIdx() {
            return myIdx;
        }

        public int getNextIdx() {
            return nextIdx;
        }

        public int getMyDepth() {
            return myDepth;
        }

        public int getMyValue() {
            return myValue;
        }
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;

        Stack<Dfs> stack = new Stack<>();

        stack.push(new Dfs(0, 1, 0, numbers[0]));
        stack.push(new Dfs(0, 1, 0, numbers[0] * -1));

        while (!stack.isEmpty()) {
            Dfs pop = stack.pop();

            if (pop.getMyDepth() == numbers.length - 1 && pop.getMyValue() == target) {
                answer++;
            }
            if (pop.getMyIdx() < numbers.length-1) {
                stack.push(new Dfs(pop.getMyIdx() + 1,
                        pop.getNextIdx() + 1, pop.getMyDepth() + 1,
                        pop.getMyValue() + numbers[pop.getNextIdx()]));
                stack.push(new Dfs(pop.getMyIdx() + 1,
                        pop.getNextIdx() + 1, pop.getMyDepth() + 1,
                        pop.getMyValue() + numbers[pop.getNextIdx()] * -1));
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        TargetNumber targetNumber = new TargetNumber();
        int solution = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println("solution = " + solution);
    }
}
