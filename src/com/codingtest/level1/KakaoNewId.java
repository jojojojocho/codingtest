package com.codingtest.level1;

//카카오 아이디추천
public class KakaoNewId {


    public static String solution(String new_id) {

        // 1단계 :소문자로 변경
        try {
            new_id = new_id.toLowerCase();
            System.out.println("소문자로변경:" + new_id);

            //2단계 :특수문자 제거
            String match = "[^a-z0-9-_.]";
            new_id = new_id.replaceAll(match, "");
            System.out.println("특수문자제거:" + new_id);

            //3단계 :점두개를 점하나로
            new_id = new_id.replace("..", ".");
            System.out.println("점두개면 제거:" + new_id);
        } catch (Exception e) {
            if (new_id.length() == 0) new_id = "a";
        }

        //4단계 :마침표 처음이나 마지막에 있으면 제거
        try {
            char fstChar = new_id.charAt(0);
            char lastChar = new_id.charAt(new_id.length() - 1);

            while (fstChar == '.') {
                try {
                    new_id = new_id.substring(1, new_id.length() - 1);
                    fstChar = new_id.charAt(0);
                } catch (Exception e) {
                    if (new_id.length() == 0) new_id = "a";
                    break;
                }
            }
            while (lastChar == '.') {
                try {
                    new_id = new_id.substring(0, new_id.length() - 1);

                    lastChar = new_id.charAt(new_id.length() - 1);
                } catch (Exception e) {
                    if (new_id.length() == 0) new_id = "a";
                    break;
                }
            }
        } catch (Exception e) {
            if (new_id.length() == 0) new_id = "a";
        }

        System.out.println("마침표가처음이나 마지막이면 제거:" + new_id);

        //5단계: 빈문자열일시 a넣기
        try {
            if (new_id.length() == 0) new_id = "a";

            System.out.println("빈문자열이면 제거:" + new_id);

            //6단계: 길이가 16이상이면 15로 줄이기 마지막 문자가 .이면 .제거
            if (new_id.length() >= 16) new_id = new_id.substring(0, 15);
            //.이면 제거
            char lastChar2 = new_id.charAt(new_id.length() - 1);
            if (lastChar2 == '.') new_id = new_id.substring(0, 14);
        } catch (Exception e) {
            if (new_id.length() == 0) new_id = "a";
        }
        System.out.println("길이가 16이상이고 마지막 문자가 .이면 제거" + new_id);

        //7단계: 길이가 2자 이하라면 new_id의 마지막 문자를 new_id의 길이가 3이 될때까지 반복해서 끝에 붙입니다.
        while (new_id.length() <= 2) {
            try {
                char repeat = new_id.charAt(new_id.length() - 1);
                new_id = new_id + repeat;
            } catch (Exception e) {
                if (new_id.length() == 0) new_id = "a";
                break;
            }
        }
        System.out.println("길이가 2이하라면 마지막문자로 반복해서 붙여서 길이증가:" + new_id);

        String answer = new_id;
        return answer;
    }

    public static void main(String[] args) {
        String ans = solution("=.=");
        System.out.println(ans);
    }
}
