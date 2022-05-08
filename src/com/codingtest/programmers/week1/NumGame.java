package com.codingtest.programmers.week1;


import java.util.Arrays;
import java.util.Comparator;

public class NumGame {

    public static int solution(int[] A, int[] B) {
        int cnt=0;
        Integer[] integerA = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Integer[] integerB = Arrays.stream(B).boxed().toArray(Integer[]::new);

        Arrays.sort(integerA,Comparator.reverseOrder());
        Arrays.sort(integerB);

//        List<Integer> integerListA = new ArrayList<>(Arrays.asList(integerA));
//        List<Integer> integerListB = new ArrayList<>(Arrays.asList(integerB));
        int min=999;
        for(int i =0; i<integerB.length;i++){
            if(integerB[i]==0){
                continue;
            }
            for (int j=0; j<integerA.length;j++){
                if(integerA[j]==0){
                    continue;
                }
                 min= integerB[i] - integerA[j];
                if(min>0){
                    integerA[j]=0;
                    integerB[i]=0;
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{5, 1, 3, 7}, new int[]{2,2,6,8});
        System.out.println("solution = " + solution);
    }
}
