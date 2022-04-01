package com.codingtest.programmers.level2;

public class TargetNumber2 {
    static int cnt;
    public void  recur(int[] numbers, int idx, int target, int answer){
        if (idx == numbers.length){
            if(answer==target){
                cnt++;
            }
        }else{
            recur(numbers, idx + 1, target, answer + numbers[idx]);
            recur(numbers, idx + 1, target, answer + numbers[idx] * -1);
        }
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        recur(numbers, 0, target, 0);
        return cnt;
    }

    public static void main(String[] args) {
        TargetNumber2 targetNumber2 = new TargetNumber2();
        int solution = targetNumber2.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println("solution = " + solution);
    }
}
