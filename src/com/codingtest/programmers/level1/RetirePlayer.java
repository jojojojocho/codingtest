package com.codingtest.programmers.level1;


import java.util.*;

//완주하지 못한 선수
public class RetirePlayer {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> mapPart = new HashMap<>();
        Map<String, Integer> mapComp = new HashMap<>();

        for (String part : participant) {
            if (!mapPart.containsKey(part)) {
                mapPart.put(part, 1);
            } else {
                mapPart.put(part, mapPart.get(part) + 1);
            }
        }

        for (String comp : completion) {
            if (!mapComp.containsKey(comp)) {
                mapComp.put(comp, 1);
            } else {
                mapComp.put(comp, mapComp.get(comp) + 1);
            }
        }

        Iterator<String> iterator = mapPart.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            if (!(mapPart.get(key).equals(mapComp.get(key)))) {
                return key;
            }
        }

        return "";
    }



    public static void main(String[] args) {
        RetirePlayer r=new RetirePlayer();
        String []p={"mislav", "stanko", "mislav", "ana"};
        String []e={"stanko", "ana", "mislav"};
        System.out.println(r.solution(p,e));
    }

}
