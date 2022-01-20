package com.codingtest.programmers.level2;

import java.util.*;

public class Camouflage {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String[] clothe : clothes) {
            String key=clothe[1];
            int value=hm.getOrDefault(key,-1);
            if (value!= -1){
                hm.put(key,value+1);
            }else{
                hm.put(key,1);
            }
        }

        int valuesLength=hm.size();
        Collection<Integer> colArr =  hm.values();
        Iterator<Integer> iterator = colArr.iterator();
        ArrayList<Integer> intArr = new ArrayList<>();
        while (iterator.hasNext()){
            intArr.add(iterator.next());
        }
        int sum=1;
        for (Integer integer : intArr) {
            sum*=integer+1;
        }


        return sum-1;
    }

    public static void main(String[] args) {
        Camouflage camouflage = new Camouflage();
        int a = camouflage.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println("a = " + a);
        
        
        
    }
}
