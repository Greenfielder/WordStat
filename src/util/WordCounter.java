package util;

public class WordCounter {

    public static void counter(String fileContent) {
        String[] words = fileContent.split("\\s+");
        System.out.println("Количество слов в файле: " + words.length);
    }
}
