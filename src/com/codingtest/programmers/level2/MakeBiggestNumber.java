package com.codingtest.programmers.level2;

//큰 수 만들기
public class MakeBiggestNumber {

    public String solution(String number, int k) {
        //리턴 할 배열
        char[] answerCharList = new char[(number.length() - k)];

        //숫자를 하나씩 쪼개기
        char[] charArray = number.toCharArray();

        int max;
        int leftIdx = 0;
        int rightIdx =k+1;
        int cnt=0;

        //자릿수 만큼 돌기
        for (int j=0;j<number.length() - k;j++) {

            max = 0;

            for (int i = leftIdx; i <rightIdx; i++) {
                int numValue = Character.getNumericValue(charArray[i]);
                if (numValue > max) {
                    leftIdx = i+1;
                    max = numValue;
                    if(numValue==9) break;
                }
            }
            rightIdx++;
            answerCharList[cnt++]= Character.forDigit(max,10);
        }
        return String.valueOf(answerCharList);
    }

    public static void main(String[] args) {
        MakeBiggestNumber makeBiggestNumber = new MakeBiggestNumber();
        String solution = makeBiggestNumber.solution("4177252841", 4);
        System.out.println(solution);
    }
}
