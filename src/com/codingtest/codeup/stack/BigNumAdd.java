package com.codingtest.codeup.stack;

import java.util.*;
//3021 : 큰 수 덧셈
public class BigNumAdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        String number1 = scanner.next();
        String number2 = scanner.next();

        String[] numCharArr1 = number1.split("");
        String[] numCharArr2 = number2.split("");


        for (String s : numCharArr1) {
            stack1.push(s);
        }
        for (String s : numCharArr2) {
            stack2.push(s);
        }

        int length = Math.max(numCharArr1.length, numCharArr2.length);

        List<String> stringList = new ArrayList<>();
        int oneDigit = 0;
        int twoDigit = 0;

        for (int i = 0; i < length; i++) {

            if (!stack1.isEmpty() && !stack2.isEmpty()) {

                int stack1Num = Integer.parseInt(stack1.pop());
                int stack2Num = Integer.parseInt(stack2.pop());
                int sum = stack1Num + stack2Num;
                sum = sum + oneDigit;

                if (sum >= 10) {
                    twoDigit = sum - 10;
                    oneDigit = 1;
                } else {
                    twoDigit = sum;
                    oneDigit = 0;
                }

            } else if (stack1.isEmpty()) {
                int stack2Num = Integer.parseInt(stack2.pop());
                twoDigit = stack2Num + oneDigit;

                if (twoDigit >= 10) {
                    oneDigit = 1;
                    twoDigit = twoDigit - 10;
                } else {
                    oneDigit = 0;
                }
            } else if (stack2.isEmpty()) {
                int stack1Num = Integer.parseInt(stack1.pop());
                twoDigit = stack1Num + oneDigit;

                if (twoDigit >= 10) {
                    oneDigit = 1;
                    twoDigit = twoDigit - 10;
                } else {
                    oneDigit = 0;
                }
            }

            String s = String.valueOf(twoDigit);
            stringList.add(s);

            if (i == length - 1 && oneDigit == 1) {
                stringList.add(String.valueOf(oneDigit));
            }
        }

        Collections.reverse(stringList);

        for (int j = 0; j < stringList.size(); j++) {
            System.out.print(stringList.get(j));
        }


    }
}
