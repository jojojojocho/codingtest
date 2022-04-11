package com.codingtest.backjun.codeplus.math;


import java.io.*;
import java.util.StringTokenizer;
/*
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */

//난이도 : 실버3
//1929번 소수구하기
//접근 방법 :
// 1. 사이에 있는 숫자를 소수 판별(에라토스테네스의 체 사용) 후 출력

public class FindPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = 0L;
        long end = 0L;

        start = Long.parseLong(st.nextToken());
        end = Long.parseLong(st.nextToken());

        boolean[] bool = new boolean[(int) (end+1)];

        bool[0] = true;
        bool[1] = true;

        for(int i =2; i<end+1 ; i++){
            if(bool[i]==false){
                if(i>=start) {
                    bw.write(String.valueOf(i));
                    bw.write("\n");
                }
                for(int j = 1; (long) i * j<end+1; j++) {
                    bool[i*j] = true;
                }
            }
        }

        bw.flush();
    }

}
