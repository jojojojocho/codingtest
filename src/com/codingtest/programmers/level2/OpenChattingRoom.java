package com.codingtest.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChattingRoom {

    public String[] solution(String[] records) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < records.length; i++) {

            // 하나의 기능을 수행한다는 메시지를 쪼개기
            String[] splitRecord = records[i].split(" ");

            if(splitRecord[0].equals("Enter") || splitRecord[0].equals("Change"))
                map.put(splitRecord[1], splitRecord[2]);
        }

        for(int i = 0; i < records.length; i++){

            String[] splitRecord = records[i].split(" ");
            String id = map.get(splitRecord[1]);

            if(splitRecord[0].equals("Enter"))
                list.add(id+"님이 들어왔습니다.");
            else if (splitRecord[0].equals("Leave"))
                list.add(id+"님이 나갔습니다.");

        }

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}
