package com.codingtest.backjun.codeplus.math;


import java.io.*;
import java.util.StringTokenizer;
/*
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
