package com.codingtest.leetcode.etc;

import java.util.HashMap;

//익명의 편지
public class AnonymousLetter {
    public boolean isLetterConstructibleFromMagazine (String letterText, String magazineText){
        if (letterText.length()>magazineText.length()){
            String temp;
            temp=letterText;
            letterText=magazineText;
            magazineText=temp;
        }

        HashMap<String, Integer> hm = new HashMap<>();
        char[] charArray = letterText.toCharArray();
        char[] charArray1 = magazineText.toCharArray();

        int cnt=0;

        for (int i = 0; i < charArray.length; i++) {
            char c =  charArray[i];
            String s = Character.toString(c);
            int value=hm.getOrDefault(s,0);
            hm.put(s,++value);
        }
        for (int i =0; i <charArray.length; i++){
            char c =  charArray1[i];
            String s = Character.toString(c);
            int value=hm.getOrDefault(s,0);
            if ( value== 0){
                return false;
            }else {
                hm.put(s,--value);
            }
        }
            return true;
    }


    public static void main(String[] args) {
        AnonymousLetter anonymousLetter = new AnonymousLetter();
        boolean a=anonymousLetter.isLetterConstructibleFromMagazine("abcdefg;;", "abcde");
        System.out.println(a);


    }
}
