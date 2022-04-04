package com.codingtest.backjun.codeplus.math;


import java.io.*;
import java.util.StringTokenizer;

/**
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * <p>
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * <p>
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * <p>
 * 출력
 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */

//난이도 : 브론즈 5
//10430번 나머지
//접근 방법 : 문제에 나온 식 짜고 대입 해서 출력

public class NaMeoJi {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] nList = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++)
            nList[i] = Integer.parseInt(st.nextToken());

        System.out.println((nList[0] + nList[1]) % nList[2]);
        System.out.println(((nList[0] % nList[2]) + (nList[1] % nList[2]))%nList[2]);
        System.out.println((nList[0] * nList[1]) % nList[2]);
        System.out.println(((nList[0] % nList[2]) * (nList[1] % nList[2])) % nList[2]);


    }

}
