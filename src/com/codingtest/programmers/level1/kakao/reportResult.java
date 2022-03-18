package com.codingtest.programmers.level1.kakao;

import java.util.*;

//신고 결과 받기
public class reportResult {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] idListCnt = new int[id_list.length];
        HashMap<String, Integer> reportedCnt = new HashMap<>();
        HashMap<String, Set<String>> whoReported = new HashMap<>();
        HashMap<String, Integer> mail = new HashMap<>();

//        Set<String> s = new HashSet<>(List.of(report));
        //신고당한횟수 (reportedCnt) 넣기 누가 날 신고 했는지 신고자리스트(whoReported) 만들기
        for (int i = 0; i < report.length; i++) {

            String[] s = report[i].split(" ");
            String reporter = s[0];
            String reported = s[1];

            Set<String> reporterSet = whoReported.getOrDefault(reported, new HashSet<>());
            reporterSet.add(reporter);
            whoReported.put(reported, reporterSet);

            reportedCnt.put(reported, reporterSet.size());
        }

        for (String reported : id_list) {
            Integer integer = reportedCnt.getOrDefault(reported, 0);

            if (integer >= k) {
                Set<String> stringList = whoReported.get(reported);
                for (String reporter : stringList) {
                    Integer count = mail.getOrDefault(reporter, 0);
                    count += 1;
                    mail.put(reporter, count);
                }

            }
        }
        int idx = 0;
        int[] answer = new int[id_list.length];
        for (String name : id_list) {
            Integer resultCnt = mail.getOrDefault(name, 0);
            answer[idx++] = resultCnt;
        }

    return answer;
}

    public static void main(String[] args) {
        reportResult reportResult = new reportResult();
        int[] solution = reportResult.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
