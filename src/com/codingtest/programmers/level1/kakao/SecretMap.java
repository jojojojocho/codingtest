package com.codingtest.programmers.level1.kakao;

import java.util.Arrays;

//비밀지도
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        //맵 빈거
        char[][] charmap = new char[n][n];
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            //n길이의 이진수 만들기
            String format = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i])));

            //string 을 char로 바꾸기
            char[] charArray = format.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                charmap[i][j] = charArray[j];

            }
        }

        for (int i = 0; i < arr2.length; i++) {
            //n길이의 이진수 만들기
            String format = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr2[i])));

            //string 을 char로 바꾸기
            char[] charArray = format.toCharArray();
            int idx = 0;

            for (int j=0; j< charArray.length;j++) {
                if (charmap[i][j] == '1' && charArray[j] == '0') continue;
                else charmap[i][j] = charArray[j];

            }
        }

        for (int i = 0; i < n; i++) {
            String rowString = String.valueOf(charmap[i]);
            answer[i]= rowString.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        String[] solution = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
