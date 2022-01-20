package com.codingtest.leetcode.medium;

import java.util.*;

//49. Group Anagrams
public class GroupAnagramsGr {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        List<String> list= new ArrayList<>();

        //if (strs.length==0) {return answer;}

        for (String str : strs) {
            String[] strArr = str.split("");
            Arrays.sort(strArr);
            String key=String.join("",strArr);

            List<String> values = hashMap.getOrDefault(key, new ArrayList<>());

            values.add(str);
            hashMap.put(key,values);
        }

        for (List<String> value : hashMap.values()) {
            answer.add(value);
        }
        return answer;
        }

    public static void main(String[] args) {
        List<List<String>> answer=groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
    }
}
