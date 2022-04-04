package com.codingtest.programmers.level1;
//Summer/Winter Coding(~2018) 소수만들기

public class MakePrimeNumber {

    public int solution(int[] nums) {

        int n = 3, start = 0, result1 = 0;
        boolean[] visited = new boolean[nums.length];
        result1 += combination(nums, visited, start, n);

        return result1;
    }

    public static int combination(int[] nums, boolean[] visited, int start, int n) {

        int result = 0;
        //비교
        if (n == 0) {
            int temp = 0, num = 0;
            boolean check = true;
            for (int i = 0; i < nums.length; i++) {
                if(visited[i] == true) {
                    num += nums[i];
                }
            }

            for (int l = 2; l < num; l++) {
                if (num % l == 0) {
                    check = false;
                    break;
                }
            }

            if (check) result++;

            return result;
        } else {
            for (int j = start; j < nums.length; j++) {
                visited[j] = true;
                result += combination(nums, visited, j + 1 , n - 1);
                visited[j] = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MakePrimeNumber makePrimeNumber = new MakePrimeNumber();
        int solution = makePrimeNumber.solution(new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
    }

}
