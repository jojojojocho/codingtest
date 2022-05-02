package com.codingtest.backjun.codeplus.math;
/*
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//난이도 : 실버3
//1929번 소수구하기
//접근 방법 :
// 1. 사이에 있는 숫자를 소수 판별(에라토스테네스의 체 사용) 후 출력
public class PredictOfGoldBach {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        boolean tf= false;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            boolean[] bool = new boolean[ n + 1];
            List<Integer> oddList = new ArrayList<>();

            for (int i = 2; i < n; i++) {
                if(!bool[i] && i%2!=0){
                    oddList.add(i);
                }
                int j;
                for ( j= 1; i * j < n; j++) {
                    if (!bool[i * j]) {
                        bool[i * j] = true;
                    }
                }
            }
            int i;
            for (i = 0; i <= oddList.size()/2; i++) {
                for (int j = i + 1; j < oddList.size(); j++) {
                    if (oddList.get(i) + oddList.get(j) > n) {
                        break;
                    }
                    if (oddList.get(i) + oddList.get(j) == n) {
                        bw.write(String.valueOf(n));
                        bw.write(" = ");
                        bw.write(String.valueOf(oddList.get(i)));
                        bw.write(" + ");
                        bw.write(String.valueOf(oddList.get(j)));
                        bw.write("\n");
                        tf=true;
                        break;
                    }
                }
                if(tf){
                    break;
                }
            }
            if (!tf) {
                bw.write("Goldbach's conjecture is wrong.");
                bw.write("\n");
                break;
            }else{
                tf=false;
            }
        }
        bw.flush();
        bw.close();
    }
}
