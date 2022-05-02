package com.codingtest.backjun.codeplus.math;
import java.io.*;
import java.util.StringTokenizer;

/*
 */

// 난이도 : 실버5
// 2609 번  최대공약수와 최소공배수
// 접근 방법 : 실제 소인수 분해 하는 과정으로 구현
// 1.먼저 둘다 나눠지는 수 구하면서 계속 곱해서 최대공약수 구하기
// 2. 최대공약수와 더 이상 나눠지지 않는 두개의 수를 곱하면 최소공배수

public class GreatestCommonFactor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());
        int answer = 1;
        int answer2 = 0;
        while(true){
            int min = Math.min(number1, number2);
            int i;
            for(i=2; i<=min; i++){
                if(number1%i==0 && number2%i==0){
                    number1/=i;
                    number2/=i;
                    answer*=i;
                    break;
                }
            }
            if(i>=min) {
                answer2 = answer * number1 * number2;
                System.out.println(answer);
                System.out.println(answer2);
                break;
            }
        }
    }

}
