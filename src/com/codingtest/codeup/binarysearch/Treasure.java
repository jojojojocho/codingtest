package com.codingtest.codeup.binarysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Treasure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> integerList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            integerList.add(sc.nextInt());
        }
        for(int j =0; j<n; j++) {
            int sum=integerList.get(j);
            for (int i = j+1; i < n; i++) {
                sum+=integerList.get(i);
                if(sum>k){
                    break;
                }
                if(sum==k){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
