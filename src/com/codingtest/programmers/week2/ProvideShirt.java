package com.codingtest.programmers.week2;

import java.util.Arrays;

public class ProvideShirt<main> {
    public static int solution(int[] people, int[] tshirts) {

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int answer =0;
        int pidx=0;

        for(int i =0; i<tshirts.length; i++){

            if(tshirts[i] >=people[pidx]){

                answer++; //나눠주기
                pidx++;

                //pidx indexOutofBounds exception 대비 종료조건
                if(pidx>=people.length)
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 1000}, new int[]{2, 2000});
        System.out.println("solution = " + solution);
    }

}
