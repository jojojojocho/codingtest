package com.codingtest.codeup.stack;


import java.util.*;

//천단위 구분기호
public class AddComma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        List<String> stringList= new ArrayList<>();
        int length=sc.nextInt();

        String strNum = sc.next();
        String[] strArr=strNum.split("");

        for (int i = 0; i < strArr.length; i++) {
            stack.push(strArr[i]);
        }

        for(int i = 0; i<strArr.length;i++){
            if (i%3==0){
                stringList.add(",");
            }
            stringList.add(stack.pop());
        }

        if(stringList.get(0).equals(","))
            stringList.remove(0);
        Collections.reverse(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i));
        }
    }

    

}
