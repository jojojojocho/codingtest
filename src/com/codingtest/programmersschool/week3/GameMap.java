package com.codingtest.programmersschool.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GameMap {
    class Pos {
        int x;
        int y;
        int cnt;

        public Pos(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getCnt() {
            return cnt;
        }
    }

    public int solution(int[][] maps) {
        final int X = maps.length;
        final int Y = maps[0].length;


        Queue<Pos> posQueue = new LinkedList<>();
        posQueue.offer(new Pos(X - 1, Y - 1, 1));
        int min = Integer.MAX_VALUE;
        int[][] visited = new int[maps.length][maps[0].length];
//        visited[X - 1][Y - 1]=1;

        while (!posQueue.isEmpty()) {

            Pos posObj = posQueue.poll();
            int x = posObj.getX();
            int y = posObj.getY();
            int cnt = posObj.getCnt();

//            System.out.println("x :" + (x+1) + " y : " + (y+1)+ " cnt :" + cnt);
            if(visited[x][y]!=1) {
                //왼쪽
                if (y - 1 >= 0 && maps[x][y - 1] == 1)
                    posQueue.offer(new Pos(x, y - 1, cnt + 1));

                //위쪽
                if (x - 1 >= 0 && maps[x - 1][y] == 1)
                    posQueue.offer(new Pos(x - 1, y, cnt + 1));

                //아래쪽
                if (x + 1 < X && maps[x + 1][y] == 1)
                    posQueue.offer(new Pos(x + 1, y, cnt + 1));

                //오른쪽
                if (y + 1 < Y && maps[x][y + 1] == 1)
                    posQueue.offer(new Pos(x, y + 1, cnt + 1));


                maps[x][y] = 0;
                visited[x][y]=1;
            }

            if (posObj.getX() == 0 && posObj.getY() == 0) {
                min = Math.min(min, posObj.cnt);
            }
        }

        if (min != Integer.MAX_VALUE)
            return min;

        else
            return -1;

    }

    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        int solution = gameMap.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
        System.out.println(solution);
    }
}
