package com.codingtest.backjun.codeplus.math;

/*
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
