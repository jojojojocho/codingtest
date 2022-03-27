package com.codingtest.programmers.level4;

import java.util.Stack;

public class RightBraceDfs {
    static class Dfs {
        int open, close;

        public Dfs(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

    public int solution(int n) {

        Stack<Dfs> dfs = new Stack<>();
        int answer = 0;
        dfs.push(new Dfs(0,0));

        while(!dfs.isEmpty()){
            Dfs pop = dfs.pop();

            if(pop.open>n) continue;
            if(pop.open<pop.close) continue;
            if(pop.open==n &&pop.close==n){
                answer++;
                continue;
            }

            dfs.push(new Dfs(pop.open+1, pop.close));
            dfs.push(new Dfs(pop.open, pop.close+1));
        }
        return answer;
    }

}
