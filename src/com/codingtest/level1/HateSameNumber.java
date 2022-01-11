package com.codingtest.level1;

import java.util.ArrayList;
import java.util.List;

//같은숫자는 싫어
public class HateSameNumber {
    public int[] solution(int []arr) {
        List<Integer> list= new ArrayList<>();
        int temp=-1;
        for (int i = 0; i < arr.length; i++){
            if(temp!=arr[i]){
                list.add(arr[i]);
            }
            temp=arr[i];
        }

        return list.stream().mapToInt(i->i).toArray();
    }

}
