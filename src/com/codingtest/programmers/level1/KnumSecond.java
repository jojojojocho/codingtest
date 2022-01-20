package com.codingtest.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class KnumSecond {
    public int[] solution(int[] array, int[][] commands) {

        List<Integer> returnList = new ArrayList<>();

        for (int[] command : commands) {
            List<Integer> bucketList = new ArrayList<>();
            for (int i = command[0]-1 ; i<command[1]; i++){
                bucketList.add(array[i]);
            }
            for(int i=0; i<bucketList.size()-1; i++){
                for (int j = i+1; j<bucketList.size();j++){
                    int temp;
                    if (bucketList.get(i) > bucketList.get(j)){
                        temp= bucketList.get(i);
                        bucketList.set(i,bucketList.get(j));
                        bucketList.set(j,temp);
                    }
                }
            }
            returnList.add(bucketList.get(command[2]-1));
        }

        return returnList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        KnumSecond knumSecond = new KnumSecond();
        int[] ints=knumSecond.solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3},{4,4,1}});
        System.out.println("ints[0] = " + ints[0]);
    }

}
