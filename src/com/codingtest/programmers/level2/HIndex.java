package com.codingtest.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int[] a=Arrays.stream(citations).sorted().toArray();
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            int i1 = a[i];
//            integerArrayList.add(i1);
//        }
        int cnt=1;
        for (int i =  a.length-1; i >= 0; i--) {
            if(a[i] == 0) return 0;
            else if (cnt == a[i]) return a[i];
            else if(a[i]<cnt) return cnt-1;
            cnt++;
        }
        return cnt-1;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.solution(new int[] {3, 0, 6, 1, 5}));
        System.out.println(hIndex.solution(new int[] {0, 0, 0, 0, 0}));
        System.out.println(hIndex.solution(new int[] {0, 0, 0, 0, 1}));
        System.out.println(hIndex.solution(new int[] {9, 9, 9, 12}));
        System.out.println(hIndex.solution(new int[] {10, 8, 5, 4, 3}));
        System.out.println(hIndex.solution(new int[] {25, 8, 5, 3, 3}));
        System.out.println(hIndex.solution(new int[] {1, 1, 5, 7, 6}));
        System.out.println(hIndex.solution(new int[] {0}));
        System.out.println(hIndex.solution(new int[] {0, 0}));
    }
}
