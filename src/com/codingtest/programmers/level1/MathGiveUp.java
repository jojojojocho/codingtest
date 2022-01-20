package com.codingtest.programmers.level1;

import java.util.*;

//수포자
public class MathGiveUp {

    public ArrayList<Integer> rand(int leng) {
        ArrayList<Integer> arr = new ArrayList<>() ;

        for (int i = 0; i < leng; i++) {
            //int a=(int) Math.random() * 4 + 1;
            Random random=new Random();
            int a=random.nextInt(4)+1;
            arr.add(a);

        }
        return arr;
    }


    public int[] solution(int[] answers) {
        ArrayList<Integer> supo1=rand(answers.length);
        ArrayList<Integer> supo2=rand(answers.length);
        ArrayList<Integer> supo3=rand(answers.length);
        int supo1Cnt=0;
        int supo2Cnt=0;
        int supo3Cnt=0;
        List<Integer> arr=new ArrayList<>();

        for (int i =0 ; i < answers.length; i++){
            if (answers[i]==supo1.get(i)) {
                supo1Cnt++;
            }
            if(answers[i]==supo2.get(i)){
                supo2Cnt++;
            }
            if(answers[i]==supo3.get(i)){
                supo3Cnt++;
            }
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,supo1Cnt);
        map.put(2,supo2Cnt);
        map.put(3,supo3Cnt);

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> en : entrySet ){
            int max=0;
            if (en.getValue() >=max){
                arr.add(en.getKey());
            }
        }


        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        MathGiveUp m = new MathGiveUp();
        m.solution(new int[]{1,2,3,4,5});
        System.out.println(Math.random() * 5 + 1);
    }
}
