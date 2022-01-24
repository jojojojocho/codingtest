package com.codingtest.codeup.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BestPizza {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Integer> tCalList= new ArrayList<>();

        int tKind=sc.nextInt();
        int dPrice=sc.nextInt();
        int tPrice=sc.nextInt();
        int dCal = sc.nextInt();

        for ( int i = 0 ; i<tKind ; i++){
            tCalList.add(sc.nextInt());
        }

        tCalList.sort(Comparator.reverseOrder());

        int cmp=dCal/dPrice;

        for (Integer integer : tCalList) {
                if (cmp<integer/tPrice){
                    dPrice+=tPrice;
                    dCal+=integer;
                    cmp=dCal/dPrice;
                }else{
                    break;
                }
        }
        System.out.println(cmp);
    }
}
