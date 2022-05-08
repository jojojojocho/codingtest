package com.codingtest.programmers.week1;

import java.util.ArrayList;
import java.util.List;

public class BaseStation {
//    public static int solution(int n, int[] stations, int w) {
//        int firstNum=0;
//        int lastNum=0;
//        int range=w*2+1;
//        int quotient=0;
//        for (int station : stations) {
//
//            firstNum=station-w-1;
//            quotient +=(firstNum-lastNum)/range;
//
//            if ((firstNum-lastNum)%range!=0)
//                quotient+=1;
//
//            lastNum=station+w;
//        }
//
//        if (stations[stations.length-1]< n){
//            firstNum=n-1;
//            quotient +=(firstNum-lastNum)/range;
//
//            if ((firstNum-lastNum)%range!=0)
//                quotient+=1;
//        }
//
//        return quotient;
//    }
//
    public static int solution(int n, int[] stations, int w) {

        List<Integer> integerList = new ArrayList<>();
        int range = w*2+1;
        int rightIndex =0;
        int value;
        int count=0;

        for (int station : stations) {
            value=Math.max(station-1 -w - rightIndex, 0);
            count += value / range;

            if (value % range!=0)
                count++;

            rightIndex=station+w;
        }

        int sub = stations[stations.length - 1] + w;
        int val =Math.max(n-sub, 0);
        count += val / range;

        if (val % range!=0)
            count++;

        return count;
    }



    public static void main(String[] args) {
        int solution = solution(16, new int[]{9}, 2 );
        System.out.println("solution = " + solution);
    }
}
