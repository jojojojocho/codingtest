package com.codingtest.backjun.codeplus.math;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문제
 * 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.
 * <p>
 * 출력
 * 1로 이루어진 n의 배수 중 가장 작은 수의 자리수를 출력한다.
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


