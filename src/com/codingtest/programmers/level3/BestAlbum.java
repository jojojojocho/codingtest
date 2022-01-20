package com.codingtest.programmers.level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> gMap = new HashMap<>();
        HashMap<String, List<int[]>> iMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            int value = gMap.getOrDefault(genre, -1);
            if (value != -1) {
                gMap.put(genre, play + value);

            } else {
                gMap.put(genre, play);
            }

            List<int[]> iList = iMap.getOrDefault(genre, null);
            if (iList != null) {

                iList.add(new int[] {i,play});
                iMap.put(genre, iList);
            } else {
                List<int[]> list = new ArrayList<>();


                list.add(new int[] {i,play});
                iMap.put(genre, list);
            }
        }

        List<Map.Entry<String, Integer>> entries = gMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        List<Integer> bucket = new ArrayList<>();;
        for (int i = entries.size() - 1; i >= 0; i--) {
            String key = entries.get(i).getKey();
            List<int[]> rtList = iMap.get(key);
            for (int j = 0; j < rtList.size() - 1; j++) {

                for (int k = j + 1; k < rtList.size(); k++) {
                    int play1 = rtList.get(j)[1];
                    int play2 = rtList.get(k)[1];
                    if (play1 < play2) {
                        int[] playtemp = {rtList.get(j)[0], rtList.get(j)[1]};
                        rtList.set(j, new int[]{rtList.get(k)[0], rtList.get(k)[1]});
                        rtList.set(k, playtemp);
                    }else if (play1== play2 && rtList.get(j)[0] > rtList.get(k)[0]) {
                        int[] playtemp = {rtList.get(j)[0], rtList.get(j)[1]};
                        rtList.set(j, new int[] {rtList.get(k)[0], rtList.get(k)[1]});
                        rtList.set(k, playtemp);
                    }
                }
            }
            if (rtList.size() < 2) bucket.add(rtList.get(0)[0]);
            else {
                bucket.add(rtList.get(0)[0]);
                bucket.add(rtList.get(1)[0]);
            }

        }


        int[] answer = bucket.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
