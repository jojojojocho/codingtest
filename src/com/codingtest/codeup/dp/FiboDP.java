package com.codingtest.codeup.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiboDP {

    public static List<Integer> li = new ArrayList<>();



    //bottom up
    public static int dp1(int n, List<Integer> integerList) {
        if (integerList.size() >= n)
            return integerList.get(n - 1);  //있으면 바로 리턴

        while (integerList.size() < 2)
            integerList.add(1);             //맨앞 피보나치 1,1 추가

        for (int i = integerList.size(); i < n; i++)
            integerList.add(integerList.get(i - 1) + integerList.get(i - 2)); //앞에 2개의 숫자를 더해서 리스트에 추가

        return integerList.get(n - 1); // 마지막 피보나치 수 리턴
    }


    //top down
    public static int dp2(int n) {
        while(li.size()<2)
            li.add(1);     //앞에 1,1 채우기

        if (li.size() >= n)
            return li.get(n-1); //있으면 리턴

        else{
            if(n<2)
                return 1;  // f(2) or f(1) 일때 1 을 리턴

            else
                li.add(dp2(n-1) + dp2(n-2)); // 재귀
        }

        return li.get(n-1); // 마지막 피보나치 값을 리턴
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = dp2(10);
        System.out.println( i);

    }
}
