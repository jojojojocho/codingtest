package com.codingtest.codeup.binarysearch;

import java.util.Scanner;

//2655 : 1차 함수의 x절편 구하기
public class Xintercept {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a= scanner.nextInt();
        double b= scanner.nextInt();

        double start= -1000;
        double end=1000;
        double mid=(start + end )/2;

        while (!(start == end)){
            if (-b/a == mid){
                System.out.printf("%.4f", mid);
                break;
            }else if(-b/a > mid){
                start= mid;
            }else {
                end=  mid;
            }
            mid= (start+end)/2;
        }
    }


}
