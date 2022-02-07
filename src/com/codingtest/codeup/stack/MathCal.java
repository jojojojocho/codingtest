package com.codingtest.codeup.stack;

import java.util.Scanner;
import java.util.Stack;

public class MathCal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();


        String s=scanner.next();
        String[] split = s.split("");

        for (int i = split.length-1; i >=0; i--) {
            stack1.push(split[i]);
        }
        Integer bucket1 = 0;
        Integer bucket2 = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {

            if (!stack1.peek().equals("*") && !stack1.peek().equals("+") && !stack1.peek().equals("-")){
                stack2.push(stack1.pop());
            }else{
                String tag =stack1.pop();
                if(tag.equals("*")){
                    if (bucket1==0){
                        bucket1= Integer.valueOf(stack2.pop());
                    }
                    if(bucket2==0){
                        bucket2 = Integer.valueOf(stack2.pop());
                    }
                    bucket2=bucket1*bucket2;
                    bucket1=0;
                }else if(tag.equals("+")){
                    if (bucket1==0){
                        bucket1= Integer.valueOf(stack2.pop());
                    }
                    if(bucket2==0){
                        bucket2 = Integer.valueOf(stack2.pop());
                    }
                    bucket2=bucket1+bucket2;
                    bucket1=0;

                }else if(tag.equals("-")){
                    if (bucket1==0){
                        bucket1= Integer.valueOf(stack2.pop());
                    }
                    if(bucket2==0){
                        bucket2 = Integer.valueOf(stack2.pop());
                    }
                    bucket2=bucket1-bucket2;
                    bucket1=0;
                }
            }

        }
        System.out.println(bucket2);
    }
}
