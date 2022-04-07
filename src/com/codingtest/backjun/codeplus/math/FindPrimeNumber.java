package com.codingtest.backjun.codeplus.math;




/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.


 */

import java.io.*;
import java.util.StringTokenizer;

// 난이도 : 실버4
// 1978 번  소수찾기
// 접근 방법 : 각자 소수 판별하고 맞으면 카운트 업
public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //숫자의 갯수
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //주어진 숫자를 담을 배열
        int[] arr = new int[n];
        // 소수의 갯수
        int answer = 0;

        //배열에 주어진 숫자 넣으면섯 숫자 판별
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 2 || arr[i] == 3) {
                answer++;
                continue;
            }
                int j;
            for (j = 2; j <= Math.sqrt(arr[i]); j++) {

                if (arr[i] % j == 0) break;
                else if(j == (int) Math.sqrt(arr[i])) answer++;

            }

        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
