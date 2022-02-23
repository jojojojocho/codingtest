package com.codingtest.programmersschool.week1;


public class Budget2 {

    public int solution(int n, int[] stations, int w) {

        int idx = 0; // n의 인덱스
        int wIdx = 0; // station 배열의 인덱스
        int cnt = 0; // 추가될 기지국의 갯수

        for (int i = idx; i < n; i = idx) {

            if (wIdx < stations.length && idx >= stations[wIdx] - 1 - w) {


                idx = stations[wIdx] - 1 + w;
                wIdx++;
                idx++;
                continue;

            }

            idx += 2*w;
            cnt++;
            idx++;

        }
        return cnt;
    }

    public static void main(String[] args) {
        Budget2 budget2 = new Budget2();
        int solution = budget2.solution(16, new int[]{9}, 2);
        System.out.println("solution = " + solution);
    }

}
