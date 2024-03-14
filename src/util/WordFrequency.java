package util;

import java.util.*;

public class WordFrequency {
    public static void frequency(String fileContent) {
        String[] words = fileContent.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordFrequency.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }
    }
}