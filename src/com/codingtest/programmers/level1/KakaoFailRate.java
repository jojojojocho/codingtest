package com.codingtest.programmers.level1;
//실패율

import java.util.*;

public class KakaoFailRate {
    public static int[] solution(int N, int[] stages) {
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
            int maxCnt = 0;
            double temp;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) cntOnlyMe++;
                else if (i < stages[j]) cntGreaterThenMe++;
                if (i==N+1) maxCnt++;
            }
            double failRate;
            if(cntOnlyMe==0 ) {failRate=0;}
            else if(cntGreaterThenMe==0 && cntOnlyMe==0) {failRate=0;}
            else{
                failRate =(double) (cntOnlyMe) / (cntOnlyMe + cntGreaterThenMe+maxCnt);

            }


            store.put(i, failRate);

        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(store.entrySet());
        for (int i=0; i<store.size()-1;i++){
            for (int j=i+1; j< store.size();j++){
                if(entryList.get(i).getValue()<entryList.get(j).getValue()){
                    Map.Entry<Integer, Double> temp;
                    temp=entryList.get(i);
                    entryList.set(i,entryList.get(j));
                    entryList.set(j,temp);
                }else if(entryList.get(i).getValue()>entryList.get(j).getValue()) {

                }else{
                    if(entryList.get(i).getKey() >entryList.get(j).getKey()){
                        Map.Entry<Integer, Double> temp;
                        temp=entryList.get(i);
                        entryList.set(i,entryList.get(j));
                        entryList.set(j,temp);
                    }
                }
            }
        }


        List<Integer> numList = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : entryList) {
            numList.add(entry.getKey());
        }

        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
