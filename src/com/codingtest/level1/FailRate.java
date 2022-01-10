package com.codingtest.level1;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FailRate {
    public int[] solution(int N, int[] stages) {
//        int max=0;
//        int min=9999;
//        for (int i =0; i<stages.length;i++){
//            if(stages[i]>max) max=stages[i];
//            if(stages[i]<min) min=stages[i];
//        }
        Map store = new HashMap();
        for (int i = 1; i <= N; i++) {
            int cntOnlyMe = 0;
            int cntGreaterThenMe = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) cntOnlyMe++;
                if (i < stages[j]) cntGreaterThenMe++;
            }
            int failRate;
            try {
                failRate = (int) (cntOnlyMe * 1000 / (cntOnlyMe + cntGreaterThenMe) * 1000);
            }catch (Exception e){
                failRate=0;
            }
            store.put(i, failRate);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(store.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (int) (o2.getValue() - o1.getValue());
            }
        });


        List<Integer> numList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            numList.add(entry.getKey());
        }

        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        FailRate failRate = new FailRate();
        int[] arr=failRate.solution(5, new int[]{1,2,3,4,4});
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
