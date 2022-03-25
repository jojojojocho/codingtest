package com.codingtest.programmers.level3;

public class Sticker {

    public long search (int j, int[] sticker ){
        boolean eval;
        if(j==0){
            eval=true;
        }else{
            eval=false;
        }
        long sum=0;
        for(int i=j ; i<sticker.length; i = i){
//            if()

        }
        return sum;
    }

    public long solution(int[] sticker) {
        int[] dp = new int[sticker.length];

        if(sticker.length%2>0){//홀수
            if(sticker[0] > sticker[sticker.length-1]){ //맨앞이 더 클때
                long startZeroOddFirstBig = search(0, sticker);
                long startOneOdd = search(1, sticker);
                return Math.max(startZeroOddFirstBig, startOneOdd);

            }else {// 맨 뒤가 더 클 때
                long startZeroOddLastBig = search(0, sticker);
                long startOneOdd = search(1, sticker);
                return Math.max(startZeroOddLastBig, startOneOdd);
            }

        }else{//짝수
            long startZeroPair = search(0, sticker);
            long startOnePair = search(1, sticker);
            return Math.max(startOnePair,startZeroPair);

        }
    }

    public static void main(String[] args) {
        Sticker sticker = new Sticker();
        long solution = sticker.solution(new int[]{14, 2 ,5, 1, 2, 9, 1});
        System.out.println(solution);
    }
}
