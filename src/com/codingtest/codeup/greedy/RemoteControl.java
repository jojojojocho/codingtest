package com.codingtest.codeup.greedy;

import java.util.Scanner;

public class RemoteControl {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int startTemp=sc.nextInt();
        int finalTemp=sc.nextInt();
        int dif = Math.abs(startTemp-finalTemp);
        int cnt=0;

        while(dif >= 10) {
            dif -= 10;
            cnt++;
        }
        while (dif>=5){
            if (Math.abs(dif-10) < Math.abs(dif-5)){
                dif= Math.abs(dif -10);
                cnt++;
            }else {
                dif -= 5;
                cnt++;
            }
        }
        while(dif>=1){
            if (Math.abs(dif-5) < Math.abs(dif-1)){
                dif= Math.abs(dif-5);
                cnt++;
            }else {
                dif -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
