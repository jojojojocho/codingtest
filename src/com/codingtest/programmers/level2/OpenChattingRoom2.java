package com.codingtest.programmers.level2;

import java.lang.reflect.Array;
import java.util.*;

public class OpenChattingRoom2 {
    public String[] solution(String[] records) {

        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        Arrays.sort(records, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(" ")[0].compareTo(o2.split(" ")[0]);            }
        });

        for (int i = 0; i < records.length; i++) {

            // 하나의 기능을 수행한다는 메시지를 쪼개기
            String[] splitRecord = records[i].split(" ");

            if (splitRecord[0].equals("Change")){

                map.put(splitRecord[1], splitRecord[2]);

            }else if(splitRecord[0].equals("Enter")){

                String id = map.getOrDefault(splitRecord[1], splitRecord[2]);
                map.put(splitRecord[1], id );
                list.add(map.get(id)+"님이 들어왔습니다.");

            }else {
                list.add(map.get(splitRecord[1])+"님이 나갔습니다.");
            }
        }

//        for(int i = 0; i < records.length; i++){
//
//            String[] splitRecord = records[i].split(" ");
//            String id = map.get(splitRecord[1]);
//
//            if(splitRecord[0].equals("Enter"))
//                list.add(id+"님이 들어왔습니다.");
//            else if (splitRecord[0].equals("Leave"))
//                list.add(id+"님이 나갔습니다.");
//
//        }

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }

    public static void main(String[] args) {
        OpenChattingRoom2 openChattingRoom2 = new OpenChattingRoom2();
        String[] solution = openChattingRoom2.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }

}
