package com.codingtest.programmersschool.week3;

import java.util.*;

public class Camo {


    public int solution(String[][] clothes) {

        Map<String, List<String>> hm = new HashMap<>();
        List<Integer> arr =  new ArrayList<>();
        int index =0;
        int answer=1;

        //해시 이용해서 테이블 만들기
        for (int i=0;i< clothes.length;i++){
            List<String> stringArrayList = hm.getOrDefault(clothes[i][1],new ArrayList<String>());
            stringArrayList.add(clothes[i][0]);
            hm.put(clothes[i][1], stringArrayList);
        }

        //해시 값 리스트의 길이 가져오기
        for(Map.Entry<String, List<String>> m : hm.entrySet()) {
            arr.add(m.getValue().size());
            answer *= arr.get(index++) +1;
        }

        return answer-1;
    }

    public static void main(String[] args) {

    }


}
