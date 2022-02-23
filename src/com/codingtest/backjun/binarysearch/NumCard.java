package com.codingtest.backjun.binarysearch;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//10815 숫자 카드
public class NumCard {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] nList = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++)
            nList[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nList);
        int M= Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        for(int i =0; i< M; i++) {

            int value = Integer.parseInt(st.nextToken());
            int start = 0;  //시작점
            int end = nList.length-1; //끝점
            int mid = 0;

            while (true){
                mid = (start+end)/2;

                if(start> end ){ // 동일한 값을 못 찾았을 때 break;
                    bw.write("0 ");
                    break;
                }

                else if(value == nList[mid]){ // 동일한 값을 찾았을 때 break;
                    bw.write("1 ");
                    break;
               }

                else if (value > nList[mid]) // 현재 값이 비교할 값보다 클 경우 start <- mid 값으로 대입
                    start=mid+1;

                else if (value <nList[mid]) // 현재 값이 비교할 값보다 작을 경우 end <- mid 값으로 대입
                    end=mid-1;

            }

        }
    }
}
