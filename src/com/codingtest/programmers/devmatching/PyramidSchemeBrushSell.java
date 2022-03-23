package com.codingtest.programmers.devmatching;

import java.util.*;

//다단계 칫솔 판매
public class PyramidSchemeBrushSell {

    /**
     *
     * @param enroll  조직 구성원
     * @param referral 조직구성원 배열의 인덱스에 해당하는 상위 조직원
     * @param seller  칫솔 판매자
     * @param amount 칫솔 판매자의 인덱스에 해당하는 조직원의 칫솔 판매량
     * @return
     */

    public int[] solution(String[] enroll,  // 조직 구성원
                          String[] referral, // 조직구성원 배열의 인덱스에 해당하는 상위 조직원
                          String[] seller, // 칫솔 판매자
                          int[] amount  // 칫솔 판매자의 인덱스에 해당하는 조직원의 칫솔 판매량
    ) {
        int[] moneyList = new int[enroll.length];
        Map<String, Integer> map = new HashMap<>();
        Map<String,String> connect = new HashMap<>();

        for(int i=0; i<referral.length;i++){
            connect.put(enroll[i],referral[i]);
        }

        for (int i = 0; i < seller.length; i++) {
            //sell== 칫솔 판매자
            String sell = seller[i];

            //quantity == 칫솔 판매량
            int quantity = amount[i];

            //수익
            int revenue = quantity * 100;

            //상납금
            int amortization = (int) Math.round(revenue*0.1);


            //진짜 본인수익
            int realRevenue = revenue - amortization;
             map.put(sell,map.getOrDefault(sell,0) + realRevenue);



            while(amortization>0){

                //상위조직원 불러오기
                String superMember = connect.getOrDefault(sell,"-");
                if(superMember.equals("-")){
                    break;
                }

                //수익
                revenue=amortization;

                //상납금
                amortization = (int) (revenue*0.1);


                //진짜 본인수익
                realRevenue = revenue - amortization;



                sell=superMember;
                map.put(sell,map.getOrDefault(sell,0) + realRevenue);



            }
        }
        for(int i=0; i<enroll.length;i++){
            moneyList[i] = map.getOrDefault(enroll[i],0);
        }
        return moneyList;
    }
}
