package com.codingtest.codeup.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//4564 : 계단 오르기
public class Stairs {
    public static int recursion(int length, List<Integer> list) {
        if (length <=2) {

            return list.get(length - 1);

        } else {
            if (list.get(length-1) < list.get(length-2)) {
                return recursion(length - 2, list) + list.get(length-1);


            } else {
                return recursion(length - 1, list) + list.get(length-1);
            }
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            integerList.add(scanner.nextInt());
        }
        int mx=recursion(length,integerList);
        mx=mx+integerList.get(integerList.size()-1);
        System.out.println(mx);


    }
}
