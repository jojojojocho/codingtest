//package com.codingtest.backjun.dfsbfs;
//
//import java.io.*;
//import java.util.*;
//
//public class EfficientHacking {
//    public int bfs(Map<String,List<String>> map){
//        int[] visited = new int[map.keySet().size()];
//
//        for (String s : map.keySet()) {
//            int i = Integer.parseInt(s)-1;
////            if(visited[i]==0);
//        }
//    }
//
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
//        String s =stringTokenizer.nextToken();
//        String s1 =stringTokenizer.nextToken();
//
//        int node = Integer.parseInt(s);
//        int edge = Integer.parseInt(s1);
//
//        HashMap<String, List<String>> hm = new HashMap<>();
//
//        for(int i =0; i<edge; i++){
//            stringTokenizer= new StringTokenizer(br.readLine());
//            String end = stringTokenizer.nextToken();
//            String start = stringTokenizer.nextToken();
//            List<String> orDefault = hm.getOrDefault(start, new ArrayList<>());
//            orDefault.add(end);
//            hm.put(start,orDefault);
//        }
//
//    }
//}
