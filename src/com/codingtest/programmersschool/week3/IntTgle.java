package com.codingtest.programmersschool.week3;

import java.util.ArrayList;
import java.util.List;

public class IntTgle {

    public static int solution(int[][] triangle) {
        //x의 길이
        final int xLeng = triangle.length;
//        final int yLeng = (int) Math.pow(2, triangle.length);

        //누적 합 리스트 x리스트
        List<List<Integer>> outerList = new ArrayList<>();

        int[] upInts = triangle[0];
        int[] downInts = triangle[1];

        //루트 노드 부터 시작
        for (int i = 0; i < xLeng - 1; i++) {
            if (i != 0) {
                List<Integer> integerList = outerList.get(i - 1);
                upInts = integerList.stream().mapToInt(number -> number).toArray();
                downInts = triangle[i + 1];
            }
            //지역변수 선언 y리스트
            List<Integer> innerList = new ArrayList<>();

            //아래노드들과의 합
            for (int a = 0; a < triangle[i + 1].length; a++) {

                if (a == 0) {
                    innerList.add(upInts[a] + downInts[a]);
                } else if (a == triangle[i + 1].length - 1) {
                    innerList.add(upInts[a - 1] + downInts[a]);
                } else {
                    innerList.add(downInts[a] + Math.max(upInts[a - 1], upInts[a]));
                }

            }
            outerList.add(innerList); //합들을 리스트에 저장
        }

        int answer = Integer.MIN_VALUE;
        List<Integer> integerList = outerList.get(outerList.size() - 1);

        //누적 합의 마지막 노드 리스트에서 최대값 추출
        for (Integer integer : integerList) {

            if (integer > answer) {
                answer = integer;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
        System.out.println("solution = " + solution);

    }
}
