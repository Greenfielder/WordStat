package util;

public class WordLongest {

    public static void longest(String fileContent) {
        String[] words = fileContent.split("\\s+");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
