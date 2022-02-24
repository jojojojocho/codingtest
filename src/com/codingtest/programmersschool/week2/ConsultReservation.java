package com.codingtest.programmersschool.week2;

import com.codingtest.Main;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultReservation {
    public static long time(String string) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        return simpleDateFormat.parse(string).getTime();
    }

    public static String[] solution(String[][] booked, String[][] unbooked) throws ParseException {
        int idx1 = 0; // booked 인덱스
        int idx2 = 0; // unbooked 인덱스
        int idx3 = 0; // result 인덱스
        String[] nameList = new String[booked.length + unbooked.length];
        long start = Math.min(time(booked[0][0]), time(unbooked[0][0]));

        while (idx3 < booked.length + unbooked.length) {
            //예약고객 리스트가 끝났을때 나머지 돌리기
            if (idx1 >= booked.length) {
                nameList[idx3] = unbooked[idx2][1];
                idx2++;
                idx3++;
                continue;
            }
            //일반고객 리스트가 끝났을 때 나머지 돌리기
            if (idx2 >= unbooked.length) {
                nameList[idx3] = booked[idx1][1];
                idx1++;
                idx3++;
                continue;
            }

            //??
            if (time(booked[idx1][0]) - time(unbooked[idx2][0])<= 0 || start>=time(booked[idx1][0]) ) {
                nameList[idx3] = booked[idx1][1];
                idx1++;
                idx3++;


            } else{
                    nameList[idx3] = unbooked[idx2][1];
                    idx2++;
                    idx3++;

                }
            start +=600000;
        }
        return nameList;

    }

    public static void main(String[] args) throws ParseException {
        String[] solution = solution(new String[][]{{"09:55", "hae"},{"10:05","jee"}},
                new String[][]{{"10:04", "hae"}, {"14:07", "eom"}});
        for (int i = 0; i < solution.length; i++) {
            String s = solution[i];
            System.out.println("s = " + s);
        }
    }
}
