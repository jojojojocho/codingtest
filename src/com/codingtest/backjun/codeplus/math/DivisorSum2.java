package com.codingtest.backjun.codeplus.math;
/*
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다. 예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100,000)가 주어진다. 둘째 줄부터 테스트 케이스가 한 줄에 하나씩 주어지며 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
각각의 테스트 케이스마다, 한 줄에 하나씩 g(N)를 출력한다.
 */

//난이도 : 골드5
//17425번 약수의 합
//접근 방법 :
// 1. DivisorSum에서 찾은규칙을 이용 : n 이하 숫자들의 약수는 숫자 x를 n/x 만큼 가지게 됨. - 시간초과
// (ex) 9이하 숫자들 중에 2가 들어간 약수를 가지고 있는 숫자의 갯수는 9/2=4  (2,4,6,8)
// 2.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DivisorSum2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[i] = number;
            if (number > max) max = number;
        }

        int[] all = new int[max + 1];

        Arrays.fill(all, 1);

        for (int i = 2; i < max+1; i++) {
            for (int k = 2; k < max+1; k++) {
                if (i % k == 0) {
                    all[i] += i;
                }
            }
        }
        int[] stack = new int[max+1];
        for(int i =2; i<max; i++){
            all[i]=all[i]+all[i-1];
        }
        for (int i : arr) {
            System.out.println(all[i]);

        }


    }

}

