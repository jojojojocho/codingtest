package com.codingtest.backjun.codeplus.math;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 */

//난이도 : 실버 3
//4375번 1
//접근 방법 : (실패) String에서 1을 추가해주면서 integer로 파싱하고 그 값을 n으로 나눠가면서 나머지 확인
//          (성공) 나머지의 성질을 이용해야 한다. (모듈러) 1로 이루어진 숫자는 m*10+1 만큼 증가하므로 계속 나누어 주면서 0인 경우가 자릿수


public class One {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int m = 1;
            int cnt = 1;
            int check = 1;
            while (true) {

                int tmp = m % n;

                if (tmp == 0) {
                    break;
                }
                m = tmp * 10 + 1;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}


