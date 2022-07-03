package com.codingtest.backjun.codeplus.bruteforce;


//난이도 : 브론즈 1 2309번 일곱난쟁이
//접근 방법 : 9개의 값을 전부 더해서 -100한다음에 그 값을  셀렉션 소트 로 돌려서 같은 값이 나오면 2개 빼고 소트해서 출력

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SnowWhite {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;
            list.add(number);
        }
        int diff = sum-100;

        list.sort(Integer::compareTo);
        int before=0;
        int after =0;

        for (int i=0; i<list.size()-1; i++) {
            for(int j=i+1; j<list.size(); j++ ){
                if(list.get(i) + list.get(j) == diff ){
                    before= list.get(i);
                    after= list.get(j);
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if( integer!= before && integer != after)
                System.out.println(list.get(i));
            }
        }



}
