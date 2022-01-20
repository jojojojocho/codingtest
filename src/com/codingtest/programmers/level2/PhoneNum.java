package com.codingtest.programmers.level2;

import java.util.*;

//전화번호목록
public class PhoneNum {

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            if(i== phone_book.length-1) break;
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        PhoneNum phoneNum = new PhoneNum();
        boolean b = phoneNum.solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println(b);
    }


}
