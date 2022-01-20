package com.codingtest.codeup.greedy;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2001 : 최소 대금
public class MinPrice {

    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<5; i++){
            integerList.add(scanner.nextInt());
        }

        int pMin=9999;
        int jMin=9999;

        for (int i = 0; i < 3; i++) {
            if (pMin > integerList.get(i)){
                pMin= integerList.get(i);
            }
        }
        for (int i = 3; i < 5; i++) {
            if (jMin > integerList.get(i)){
                jMin= integerList.get(i);
            }
        }
        double sum = jMin+pMin;
        double lastAnswer = sum*110/100;
        System.out.printf("%.1f",lastAnswer);
    }

}
