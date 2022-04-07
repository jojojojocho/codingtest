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
// 2. 주어진 수들 중에서 max을 구하고 맥스값 만큼 약수의 합을 구하면서 더해나간다. - 시간초과
// 3. 조회시 맵을 이욯한다 - 시간초과
// 4. max값 만큼 배열을 만들고 본인 숫자의 배수의 인덱스에 있는 원래숫자에 자기자신을 더해준다.

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DivisorSum2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int max =0;
        //원래 길이의 배열
        int[] nList = new int[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            nList[i]=Integer.parseInt(st.nextToken());
            if(nList[i]>max)  max = nList[i];
        }
        //max만큼의 배열
        long[] allList= new long[max+1];
        //모든 자리에 1을 채움
        Arrays.fill(allList,1);

        for(int main =2;  main<=max; main++) {
            int i =  max/main;
            for (int sub = 1; sub <= i; sub++) {
                allList[(main*sub)] += main ;

            }
        }
        for(int i =2; i<=max ;i++){
            allList[i]+=allList[i-1];
        }
        for (int i : nList) {
            bw.write(String.valueOf(allList[i]));
            bw.write("\n");
        }
        bw.flush();



    }

}

