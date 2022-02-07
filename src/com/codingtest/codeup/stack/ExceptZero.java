package com.codingtest.codeup.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3117 : 0은 빼!
public class ExceptZero {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int length=sc.nextInt();

        for (int i = 0; i<length; i++){
            int temp = sc.nextInt();
            if (temp!=0){
                integerList.add(temp);
            }else if (integerList.size()!=0 && temp ==0){
                integerList.remove(integerList.size()-1);
            }
        }
        System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());
    }

}
