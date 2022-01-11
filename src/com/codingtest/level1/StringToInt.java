package com.codingtest.level1;
//문자열 정수로 바꾸기
public class StringToInt {
    public static int solution(String s) {
        for (int i=0; i<s.length();i++ ){
            System.out.println(s.charAt(i));
        }
        if(s.charAt(0)=='+' || s.charAt(0) == '-'){
            String snum=s.substring(1,s.length()-1);
        }
        int answer = Integer.valueOf(s);;
        return answer;
    }

    public static void main(String[] args) {
        int i =solution("-12345");
    }
}
