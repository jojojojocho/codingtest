package com.codingtest.programmers.level1;

import java.util.Arrays;

//없는숫자더하기
public class NoNumAdd {
    public static int solution(int[] numbers) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int result=0;
        for (int i : arr) {
            if(!(Arrays.stream(numbers).anyMatch(a -> a == i))){
                result += i;
            //System.out.println(Arrays.stream(numbers).anyMatch(a -> a == i));
            }

      }
//        int sum=IntStream.of(numbers).sum();
//        int arrSum=IntStream.of(arr).sum();
        int answer = result;
        return answer;
    }

    public static void main(String[] args) {
        int a=NoNumAdd.solution(new int[] {1,2,3,4,5,6,7});
        System.out.println(a);
    }

}
