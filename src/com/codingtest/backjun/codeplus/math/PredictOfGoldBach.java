package com.codingtest.backjun.codeplus.math;
/*
문제
1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.

4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.

이 추측은 아직도 해결되지 않은 문제이다.

백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.

입력
입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.

각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)

입력의 마지막 줄에는 0이 하나 주어진다.

출력
각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다.
숫자와 연산자는 공백 하나로 구분되어져 있다. 만약, n을 만들 수 있는 방법이 여러 가지라면,
b-a가 가장 큰 것을 출력한다. 또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는
"Goldbach's conjecture is wrong."을 출력한다.
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
