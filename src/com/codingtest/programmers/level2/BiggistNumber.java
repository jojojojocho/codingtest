package com.codingtest.programmers.level2;

import java.util.*;

public class BiggistNumber {

    public String solution(int[] numbers) {
        List<String> strList = new ArrayList<>();


        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            strList.add(String.valueOf(number));
        }
        for (int i = 0; i < strList.size()-1; i++) {
            for (int j = i+1; j < strList.size(); j++) {
                char[] sArrI = new char[4];
                char[] sArrJ = new char[4];
                if (strList.get(i).length() == 1){
                    for (int k = 0 ; k<1 ; k++){
                        sArrI[k]=strList.get(i).charAt(0);
                    }
                    for (int k = 1 ; k<4 ; k++){
                        sArrI[k]=strList.get(i).charAt(0);
                    }
                }else if(strList.get(i).length() ==2){
                    for (int k = 0 ; k<2 ; k++){
                        sArrI[k]=strList.get(i).charAt(k);
                    }
                    for (int k = 2 ; k<4 ; k++){
                        sArrI[k]=strList.get(i).charAt(1);
                    }
                }else if(strList.get(i).length() ==3){
                    for (int k = 0 ; k<3 ; k++){
                        sArrI[k]=strList.get(i).charAt(k);
                    }
                    for (int k = 3 ; k<4 ; k++){
                        sArrI[k]=strList.get(i).charAt(2);
                    }
                }else {
                    for (int k = 0 ; k<4 ; k++){
                        sArrI[k]=strList.get(i).charAt(k);
                    }
                }
                if (strList.get(j).length() == 1){
                    for (int k = 0 ; k<1 ; k++){
                        sArrJ[k]=strList.get(j).charAt(k);
                    }
                    for (int k = 1 ; k<4 ; k++){
                        sArrJ[k]=strList.get(j).charAt(0);
                    }
                }else if(strList.get(j).length() ==2){
                    for (int k = 0 ; k<2 ; k++){
                        sArrJ[k]=strList.get(j).charAt(k);
                    }
                    for (int k = 2 ; k<4 ; k++){
                        sArrJ[k]=strList.get(j).charAt(1);
                    }
                }else if(strList.get(j).length() ==3){
                    for (int k = 0 ; k<3 ; k++){
                        sArrJ[k]=strList.get(j).charAt(k);
                    }
                    for (int k = 3 ; k<4 ; k++){
                        sArrJ[k]=strList.get(j).charAt(2);
                    }
                }else{
                    for (int k = 0 ; k<4 ; k++){
                        sArrJ[k]=strList.get(j).charAt(k);
                    }
                }
                String s1 = new String(sArrI);
                String s2 = new String(sArrJ);

                if (Integer.parseInt(s1)<Integer.parseInt(s2)){
                    String temp;
                    temp = strList.get(i);
                    strList.set(i,strList.get(j));
                    strList.set(j,temp);
                }else if (Integer.parseInt(s1)==Integer.parseInt(s2) && Integer.parseInt(strList.get(i))>Integer.parseInt(strList.get(j))){
                    String temp;
                    temp = strList.get(i);
                    strList.set(i,strList.get(j));
                    strList.set(j,temp);
                }
        }


        }
        return String.join("",strList);
    }

    public static void main(String[] args) {

        BiggistNumber biggistNumber = new BiggistNumber();
        String s=biggistNumber.solution(new int [] {100,1000});
        System.out.println("s = " + s);
//        new int[] a = new int[]{1, 2, 3, 4, 5};
//        args.toString();
//        char[] chars = {'1','2','3'};
//        String s=new String(chars);
//        System.out.println("chars = " + s);
    }
}
