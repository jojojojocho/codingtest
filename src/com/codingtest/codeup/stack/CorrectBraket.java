package com.codingtest.codeup.stack;

import java.util.Scanner;
import java.util.Stack;

//3129 : 올바른 괄호 2
public class CorrectBraket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            stack1.push(split[i]);
        }

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (split[0].equals(")") || split[split.length - 1].equals("(")) {
                System.out.println("bad");
                break;
            }
            if (stack1.peek().equals(")")) {
                stack2.push(stack1.pop());
            } else {
                if (stack2.isEmpty()) {
                    System.out.println("bad");
                    break;
                } else {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("good");
        }
    }

}
