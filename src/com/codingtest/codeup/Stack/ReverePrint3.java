package com.codingtest.codeup.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//거꾸로출력하기 3
public class ReverePrint3 {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int length=sc.nextInt();

        for (int i = 0; i < length; i++){
            stack.push(sc.nextInt());
        }
        for(int i =0; i <length; i++){
            System.out.print(stack.peek()+ " ");
            stack.pop();
        }

    }
}
