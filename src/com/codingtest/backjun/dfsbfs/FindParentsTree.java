package com.codingtest.backjun.dfsbfs;

import java.io.*;
import java.util.*;

public class FindParentsTree {

    public static void bfs(int n, Map<Integer, List<Integer>> map) {
        int[] visited = new int[n];
        Queue<Integer> que = new LinkedList<>();
        int[][] arr = new int[n][2];

        que.offer(1);
        int index = 0;

        while (!que.isEmpty()) {

            int key = que.poll();
            List<Integer> list = map.get(key);

            for (Integer integer : list) {

                if (visited[integer - 1] == 0) {
                    arr[index][0] = key;
                    arr[index++][1] = integer;
                    que.offer(integer);
                    visited[integer - 1] = 1;

                }
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] <o2[1]){
                    return -1;
                }else{
                    return 1;
                }
            }
        });

        for(int k=1; k<arr.length;k++)
            System.out.println(arr[k][0]);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            List<Integer> tempList = new ArrayList<>();
            List<Integer> tempList1 = new ArrayList<>();

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String s = stringTokenizer.nextToken();
            Integer integer = Integer.valueOf(s);
            String s1 = stringTokenizer.nextToken();
            Integer integer1 = Integer.valueOf(s1);

            List<Integer> orDefault = hm.getOrDefault(integer, tempList);
            List<Integer> orDefault1 = hm.getOrDefault(integer1, tempList1);

            orDefault.add(integer1);
            orDefault1.add(integer);

            hm.put(integer, orDefault);
            hm.put(integer1, orDefault1);

        }
//        for (Integer integer : hm.keySet()) {
//            System.out.println("integer = " + integer);
//        }
//        for (List<Integer> value : hm.values()) {
//            for (Integer integer : value) {
//                System.out.print("integer = " + integer);
//            }
//            System.out.println();
//        }
        bfs(n, hm);
    }
}
