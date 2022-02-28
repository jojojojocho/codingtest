package com.codingtest.backjun.dfsbfs;

import java.io.*;
import java.util.*;


public class Virus {

    //dfs
    public static int dfs(int node, int edge, int[][] intTable, int[] visited ){
        int row= 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int cnt = 0;
        while (!stack.isEmpty()) {
            for (int i = 0; i < node; i++) {
                if (intTable[row][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                    cnt++;
                }
            }
            row = stack.pop();
        }

        return cnt-1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        int[][] intTable= new int[node][node];
        int[] visited = new int[node];

        //int테이블 만들기
        for (int i =0; i<edge; i++){

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int integer = Integer.parseInt(stringTokenizer.nextToken());
            int integer1 = Integer.parseInt(stringTokenizer.nextToken());
            intTable[integer-1][integer1-1] = 1;
            intTable[integer1-1][integer-1] = 1;

        }
        int dfs = dfs(node, edge, intTable, visited);
        System.out.println(dfs);


    }
}
