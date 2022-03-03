package com.codingtest.programmersschool.week3;

public class BracketNum {
    static int count;

    public static int solution(int n) {
        count=0;

        dfs(0, 0, n);
        return count;
    }

    public static void dfs(int left, int right, int n) {
        if(left < right) return;
        if(left == n && right == n) {
            count++;
            return;
        }

        if(left > n || right > n) return;

        dfs(left + 1, right, n);
        dfs(left, right + 1, n);
    }

    public static void main(String[] args) {
        int solution = solution(2);
        System.out.println(solution);
    }

}
