package com.codingtest.programmers.week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ConsultReservation {
    public static long time(String string) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        return simpleDateFormat.parse(string).getTime();
    }

//    public static String[] solution(String[][] booked, String[][] unbooked) throws ParseException {
//        int idx1 = 0; // booked 인덱스
//        int idx2 = 0; // unbooked 인덱스
//        int idx3 = 0; // result 인덱스
//        String[] nameList = new String[booked.length + unbooked.length];
//        long start = Math.min(time(booked[0][0]), time(unbooked[0][0]));
//
//        while (idx3 < booked.length + unbooked.length) {
//            //예약고객 리스트가 끝났을때 나머지 돌리기
//            if (idx1 >= booked.length) {
//                nameList[idx3] = unbooked[idx2][1];
//                idx2++;
//                idx3++;
//                continue;
//            }
//            //일반고객 리스트가 끝났을 때 나머지 돌리기
//            if (idx2 >= unbooked.length) {
//                nameList[idx3] = booked[idx1][1];
//                idx1++;
//                idx3++;
//                continue;
//            }
//
//            //??
//            if (time(booked[idx1][0]) - time(unbooked[idx2][0])<= 0 || start>=time(booked[idx1][0]) ) {
//                nameList[idx3] = booked[idx1][1];
//                idx1++;
//                idx3++;
//
//
//            } else{
//                    nameList[idx3] = unbooked[idx2][1];
//                    idx2++;
//                    idx3++;
//
//                }
//            start +=600000;
//        }
//        return nameList;
//
//    }
public static String[] solution(String[][] booked, String[][] unbooked) {
    String[] answer = {};
    ArrayList<String> answerList = new ArrayList<>();

    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
    // LocalTime indexTime = LocalTime.parse("24:00", format);
    LocalTime indexTime = LocalTime.parse("11:59", format);

    for (int i = 0; i < booked.length; i++) {
        for (int j = 0; j < unbooked.length; j++) {
            LocalTime time1 = LocalTime.parse(booked[i][0], format);
            LocalTime time2 = LocalTime.parse(unbooked[j][0], format);

            /**
             * 1. time1 < time2이면 예약된 손님 먼저 처리 -> break
             * 2. time2 > time1이고 indexTime 기준으로
             *   2-1. 예약 손님 없으면 일반 손님 처리
             *   2-2. 예약 손님 있으면 예약 손님 먼저 처리
             */
            if (time1.isBefore(time2)) {
                indexTime = time1.plusMinutes(10);
                answerList.add(booked[i][1]);
                booked[i][0] = "24:00";
                break;
            } else {
                if ((indexTime.isBefore(time1) || indexTime.equals(time1))) {
                    answerList.add(booked[i][1]);
                    booked[i][0] = "24:00";
                    indexTime = time1.plusMinutes(10);
                }
                answerList.add(unbooked[j][1]);
                indexTime = time2.plusMinutes(10);
                unbooked[i][0] = "24:00";
            }
        }

        answer = answerList.toArray(new String[booked.length + unbooked.length]);
    }

    return answer;
}


    public static void main(String[] args) throws ParseException {
        String[] solution = solution(new String[][]{{"09:55", "hae"},{"10:05","jee"}},
                new String[][]{{"10:04", "hae"}, {"14:07", "eom"}});
        for (int i = 0; i < solution.length; i++) {
            String s = solution[i];
            System.out.println(s);
        }
    }
}
