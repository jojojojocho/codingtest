package com.codingtest.codeup.Stack;

import java.util.*;

//1714 : 숫자 거꾸로 출력하기
public class ReverseOrder {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        String s = scanner.next();
        String[] strings=s.split("");

        for (int i = 0; i<strings.length; i++){
            stack.push(strings[i]);
        }
        for (int i = 0; i<strings.length; i++){
            System.out.print(stack.pop());
        }

    }
}
