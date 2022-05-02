package com.codingtest.backjun.codeplus.math;

/*
 */

//난이도 : 실버 5 1037번 약수
//접근 방법 : 진짜 약수들을 받아서 최솟값, 최댓값을 구해서 두개를 곱한다


import java.io.*;
import java.util.StringTokenizer;

public class Divisor {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(st.nextToken());
            if(max<number) max = number;
            if(min>number) min = number;
        }
        System.out.println(min*max);
    }
}
