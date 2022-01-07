package com.codingtest.level1;

public class NegPosAdd {
    public int solution(int[] absolutes, boolean[] signs) {
        //인덱스 =cnt , answer=합
        int cnt =0;
        int answer = 0;

        for (int i : absolutes){
            //양수면 더하고 음수면 빼고
            if(signs[cnt]) answer+=i;
            else answer-=i;
            cnt++;
        }
        return answer;
    }
}
