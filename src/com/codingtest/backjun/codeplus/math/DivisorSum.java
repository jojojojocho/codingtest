package com.codingtest.backjun.codeplus.math;

/*
문제
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다.
자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다.
x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
첫째 줄에 g(N)를 출력한다.
 */

//난이도 : 실버 2
//17427번 약수의 합
//접근 방법 :
// 1.각 숫자마다 약수를 구해서 각각 더해 나간다. - 시간초과
// 2. 2번째 루프를 sqrt 만큼 도는 걸로 변경 - 시간초과
// 3. 찾은규칙 : n 이하 숫자들의 약수는 숫자 x를 n/x 만큼 가지게 됨. - 해결
// (ex) 9이하 숫자들 중에 2가 들어간 약수를 가지고 있는 숫자의 갯수는 9/2=4  (2,4,6,8)
import java.io.*;

public class DivisorSum {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+= (long) i *(n / i);

        }
        System.out.println(sum);
    }
}
