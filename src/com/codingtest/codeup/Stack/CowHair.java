package com.codingtest.codeup.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//3130 : 소들의 헤어스타일
public class CowHair {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Integer> cowList = new ArrayList<>();

        int cowNum=scanner.nextInt();

        for (int i = 0; i < cowNum; i++) {
            cowList.add(scanner.nextInt());
        }
        int cnt=0;
        for (int i= 0; i<cowList.size()-1; i++){
            for (int j=i+1;j<cowList.size(); j++){
                if (cowList.get(i)<=cowList.get(j)){
                    break;
                }else{
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
