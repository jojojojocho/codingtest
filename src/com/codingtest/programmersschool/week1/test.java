package com.codingtest.programmersschool.week1;

public class test {

    public static int solution(int n, int[] stations, int w) {
        int rightIndex = 0;
        int leftIndex = 0;
        int value = 0;
        int range = 2 * w + 1;
        int count = 0;
        for (int station : stations) {

            int index = station - 1;
            leftIndex = Math.max(index - 1, 0);
            value = Math.max(leftIndex - rightIndex, 0);
            count += value / range;

            if (value % range != 0)
                count++;

            rightIndex = index + w + 1;
        }

        int lastSub = Math.max(n - rightIndex, 0);
        count += lastSub / range;

        if (lastSub % range != 0)
            count++;

        return count;
    }

    public static void main(String[] args) {
        int solution = solution(16, new int[]{9}, 2);
        System.out.println("solution = " + solution);
    }
}
