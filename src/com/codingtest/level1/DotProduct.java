package com.codingtest.level1;

public class DotProduct {
    public long solution(int[] a, int[] b) {
        long sum=0;
        for (int i =0; i<a.length; i++){
            long s=a[i]*b[i];
            sum+=s;
        }
        long answer = sum;
        return answer;
    }

}
