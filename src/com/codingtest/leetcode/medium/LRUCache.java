package com.codingtest.leetcode.medium;

import java.util.*;

//146. LRU Cache
public class LRUCache {

    Map<Integer,Integer> map = new HashMap<>();
    int[] arr;



    public LRUCache(int capacity) {
        this.arr = new int[capacity];
    }


    public int get(int key) {
        int value =map.getOrDefault(key,-1);
        if(value==-1)
        return -1;
        return 1;

    }

    public void put(int key, int value) {



    }



    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(i);
        }
        System.out.println(integers.get(5));
        integers.remove(5);
        System.out.println(integers.get(5));
    }
}
