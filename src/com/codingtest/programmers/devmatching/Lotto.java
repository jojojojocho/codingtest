package com.codingtest.programmers.devmatching;

import java.util.Arrays;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCnt=0;  // 0갯수
        int matchingCnt=0;  // 같은 숫자 갯수

        for (int i = 0; i < lottos.length; i++) {
            int lotto = lottos[i];

            if(lotto==0){
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                int win_num = win_nums[j];
                if(lotto==win_num){
                    matchingCnt++;
                    break;
                }
            }
        }
        int best = 7 - (zeroCnt+matchingCnt);
        int worst = 7 - matchingCnt;

        if(best>5) best=6;
        if(worst>5) worst=6;

        int[] answer={best,worst};
        return answer;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] ints = {44, 1, 0, 0, 31, 25};
        lotto.solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19});
        Arrays.sort(ints);
        int i = Arrays.binarySearch(ints, 2);
        System.out.println("i = " + i);
    }

}
