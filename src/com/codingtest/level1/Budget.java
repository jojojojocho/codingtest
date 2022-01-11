package com.codingtest.level1;

public class Budget {

    public int solution(int[] d, int budget) {
        // 1.정렬
        for (int i = 0; i < d.length-1; i++){
            for (int j = i+1;j<d.length;j++ ){
                int temp;
                if (d[i] >d[j]){
                    temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        //2.예산을 적은 부서부터 더하면서 전체예산과 대소비교
        int bugetTemp=0;
        int bugetCnt=0;
        for (int i =0;i<d.length;i++){
            bugetTemp+=d[i];
            if(bugetTemp<=budget){
                ++bugetCnt;
            }else{
                break;
            }

        }
        int answer = bugetCnt;
        return answer;
    }

}
