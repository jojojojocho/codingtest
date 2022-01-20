package com.codingtest.programmers.level1;

//나머지가 1이되는 수
public class RemainderOne {
    public int solution(int n) {
        for(int i =1; i<n ; i++){
            if (n%i==1){
                return i;
            }
        }
        return n-1;
    }

}
