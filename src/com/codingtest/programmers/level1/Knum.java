package com.codingtest.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knum {
    public int[] solution(int[] array, int[][] commands) {
        int kNum=0;
        List<Integer> kNumList = new ArrayList<>();

        for (int[] command : commands){
            List<Integer> list = new ArrayList<>();
            for (int i = (command[0]-1);i<command[1];i++){
                list.add(array[i]);
            }

            Collections.sort(list);
            kNum=list.get(command[2]-1);
            kNumList.add(kNum);
        }

        return kNumList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Knum k = new Knum();
        int[] result =k.solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3}, {4,4,1}, {1,7,3}});
    }
}
