import java.io. * ;
import java.util. * ;


// Решение в дном файле
public class AllInOne {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        String longestWord = "";

        Map<String, Integer> wordFrequency = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            wordCount++;

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
        }

        System.out.println("Количество слов: " + wordCount);
        System.out.println("Самое длинное слово: " + longestWord);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }
    }
}
