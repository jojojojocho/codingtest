package com.codingtest.level1;

public class PrimeNum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4,5,6,7,8}; //조합을 만들 배열
        int leng=nums.length;
        int cnt=0;

        for (int a=0; a< leng-2; a++){

            for (int b = a+1; b< leng-1; b++){

                for (int c = b+1; c< leng; c++){
                    int sum=nums[a] +nums[b] +nums[c];
                    for (int i =2 ; i<sum ; i++){
                        if(sum % i ==0){
                            break;
                        }else if(i == sum-1){
                            cnt++;
                        }

                    }

                }
            }
        }
        System.out.println(cnt);
    }


}
