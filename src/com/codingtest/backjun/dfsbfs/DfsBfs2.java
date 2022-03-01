package com.codingtest.backjun.dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class DfsBfs2 {

    public static void dfs(int node, int edge, int start, int[][] intTable, int[] visited) {
        int row = start - 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(row);

        while (!stack.isEmpty()) {
            row = stack.pop();
            visited[row]=1;
            System.out.print( row+1 + " ");

            for (int i = 0; i <node ; i++) {
                if (intTable[row][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                    break;
                }
            }

        }
    }

    public static void bfs ( int node, int edge, int start, int[][] intTable, int[] visited){
        int row = start - 1;
        Queue<Integer> que = new LinkedList<>();
        que.offer(row);
//        visited[row] = 1;

        while (!que.isEmpty()){
            row = que.poll();
            visited[row] = 1;
            System.out.print(row + 1 + " ");

            for(int i=0; i<node ; i++){
                if(visited[i]==0 && intTable[row][i]==1){
                    que.offer(i);
                    visited[i]=1;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(stringTokenizer.nextToken());
        int edge = Integer.parseInt(stringTokenizer.nextToken());
        int start = Integer.parseInt(stringTokenizer.nextToken());

        int[][] intTable = new int[node][node];
        int[] visited = new int[node];

        int[][] intTablebfs = intTable.clone();
        int[] visitedbfs = visited.clone();

        for (int i = 0; i < edge; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int integer = Integer.parseInt(stringTokenizer.nextToken());
            int integer1 = Integer.parseInt(stringTokenizer.nextToken());

            intTable[integer - 1][integer1 - 1] = 1;
            intTable[integer1 - 1][integer - 1] = 1;
        }
        dfs(node, edge, start, intTable, visited);
        System.out.println();
        bfs(node, edge, start, intTablebfs, visitedbfs);
    }
}
