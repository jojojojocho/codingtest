package com.codingtest.level1;

import java.util.Arrays;

public class Lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int corNum = 0;

        //1. 0 갯수 구하기
        for(int i=0; i<6; i++){
            if (lottos[i] == 0) zeroCnt++;
        }

        //2. 일치 숫자 개수 구하기
        for (int i=0; i<6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) corNum ++;
            }
        }
        //3. 최대 최소 등수 계산
        int max=corNum+zeroCnt;
        int min=corNum;

        int[] maxMinSet={0,0};
        String[] oneSix={"0","1","2","3","4","5","6"};
        int[] wonList={6,6,5,4,3,2,1};

        int maxIndex=Arrays.asList(oneSix).indexOf(Integer.toString(max));
        int minIndex=Arrays.asList(oneSix).indexOf(Integer.toString(min));

        System.out.println(maxIndex);
        System.out.println(minIndex);
        int[] answer={wonList[maxIndex],wonList[minIndex]};
//        //4. 비교해서 등수 배열에 넣기
//        if(max ==6){
//            answer[0]=1;
//        }else if(max ==5){
//            answer[0]=2;
//        }else if(max ==4){
//            answer[0]=3;
//        }else if(max ==3){
//            answer[0]=4;
//        }else if(max ==2){
//            answer[0]=5;
//        }else if(max<2){
//            answer[0]=6;
//        }
//
//        if(min <2){
//            answer[1]=6;
//        }else if(min ==2){
//            answer[1]=5;
//        }else if(min ==3){
//            answer[1]=4;
//        }else if(min ==4){
//            answer[1]=3;
//        }else if(min ==5){
//            answer[1]=2;
//        }else if(min ==6){
//            answer[1]=1;
//        }


        return answer;
    }


    public static void main(String[] args) {
        int[] a= solution(new int[]{44,1,0,0,31,25},new int[]{31,10,45,1,6,19});




    }
}
