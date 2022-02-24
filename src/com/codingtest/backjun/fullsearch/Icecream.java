package com.codingtest.backjun.fullsearch;

import java.io.*;
import java.util.StringTokenizer;

public class Icecream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = Integer.parseInt(st.nextToken());
        System.out.println("i = " + i);
        int j = Integer.parseInt(st.nextToken());
        System.out.println("j = " + j);

    }

}
