package com.codingtest.programmersschool.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GameMap {
    public static int solution(int[][] maps) {
        int x = 0;
        int y = 0;
        int rowLength = maps.length;
        int colLength = maps[0].length;
        int row = 0;
        int cnt = 1;
        Stack<Integer> xq = new Stack<>();
        Stack<Integer> yq = new Stack<>();
        ArrayList<Integer> integer = new ArrayList<>();

        if (maps[rowLength - 2][colLength - 1] == 0 && maps[rowLength - 1][colLength - 2] == 0) return -1;

        while (x < rowLength || y < colLength) {

            if (y<colLength-1&&maps[x][y + 1] == 1) { //오른쪽
                xq.push(x);
                yq.push(y);
                maps[x][y] = 0;
                cnt++;
                y++;
            } else if (maps[x + 1][y] == 1) { // 아래쪽
                xq.push(x);
                yq.push(y);
                maps[x][y] = 0;
                cnt++;
                x++;
            } else if (maps[x][y - 1] == 1) { //위쪽
                xq.push(x);
                yq.push(y);
                maps[x][y] = 0;
                cnt++;
                y--;

            } else if (maps[x - 1][y] == 1) { // 왼쪽
                xq.push(x);
                yq.push(y);
                maps[x][y] = 0;
                cnt++;
                x--;
            } else {                         //다 막혔을때
                maps[x][y] = 0;
                x = xq.pop();
                y = yq.pop();
                maps[x][y] = 1;
                cnt--;
            }


        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
        System.out.println(solution);
    }
}
