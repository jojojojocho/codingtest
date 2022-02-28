package com.codingtest.backjun.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;

public class test {
    public static void main(String[] args) throws IOException, ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
//        Date date1 = new Date(System.currentTimeMillis());
//        Date date2 = new Date(System.currentTimeMillis());
//
//        String data1 = simpleDateFormat.format(date1);
//
//        String data2 = simpleDateFormat.format(date2);
//
//        int i = data1.compareTo(data2);
//
//
//        if (i > 0) {
//
//            System.out.println("data2");
//        }else if(i ==0){
//            System.out.println("same"+(date1.getTime()- date2.getTime()));
//        }else{
//            System.out.println("data1");
//        }

//        String s = "09:00";
//        String s1= "09:10";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
//        Date format1 = simpleDateFormat.parse(s);
//        Date format2 = simpleDateFormat.parse(s1);
//
//        long s2 = format1.getTime()-format2.getTime();
//
//        Date date = new Date(s2);
//        String format = simpleDateFormat.format(date);
//        System.out.println("format = " + format);


        String s = "09:00";
        String s1 = "10:01";
        int i = s.compareTo(s1);
        System.out.println("i = " + i);


    }

}
