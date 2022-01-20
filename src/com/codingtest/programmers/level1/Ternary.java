package com.codingtest.programmers.level1;

import java.util.ArrayList;
import java.util.List;

//3진법 뒤집기
public class Ternary {
    public static int solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        int answer=0;

        while(n>0){
            list.add(n%3);
            n=n/3;
//            if(n==0){
//                break;
//            }
        }

        cnt = list.size()-1;
        double jinbeob=3;

        for (int i : list.stream().mapToInt(i-> (int) i).toArray()){
            answer = answer +(i*(int) Math.pow(jinbeob ,cnt));
            cnt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        int j =solution(45);
        System.out.println(j);
    }
}
