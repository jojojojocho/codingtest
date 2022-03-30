package com.codingtest.programmers.level3;

import java.util.Arrays;

public class WordChange {
    public int solution(String begin, String target, String[] words) {

        //담을거
        int[][] bucket = new int[words.length][begin.length()];

        int answer = 0;
        //타겟이 들어있으면
        if (Arrays.asList(words).contains(target)) {
            //워드에서 몇번째에 타겟이 있는지 인덱스 확인
            int idx = Arrays.binarySearch(words, target);
            char[] charBegin = begin.toCharArray();
            while (!words.equals(target)) {
                int cnt=0;
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    char[] charWord = word.toCharArray();
                    for (int j = 0; j < charWord.length; j++) {
                        if(charBegin[j] == charWord[j]){
                            cnt++;
                        }
                    }
                    if(cnt==begin.length()-1){
                        begin=word;
                        words[i]="zzz";
                        answer++;
                        break;
                    }
                }




            }
            return answer;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        WordChange wordChange = new WordChange();
        int solution = wordChange.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println("solution = " + solution);
    }
}
