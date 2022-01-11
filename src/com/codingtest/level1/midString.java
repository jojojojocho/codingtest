package com.codingtest.level1;
//가운데 글자
public class midString {
    public String solution(String s) {
        int answer = 0;
        if(!(s.length()%2==0)) {
            answer=(int) s.length()/2;
            return s.substring(answer,answer+1);
        }else{
            answer=(s.length()/2)-1;
            return s.substring(answer,answer+2);
        }
    }

}
