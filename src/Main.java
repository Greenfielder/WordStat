import util.FileReader;
import util.WordFrequency;
import util.WordLongest;
import util.WordCounter;

// Решение разбитое на классы
public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String fileContent = fileReader.readFile("input.txt");

        WordCounter.counter(fileContent);
        WordLongest.longest(fileContent);
        WordFrequency.frequency(fileContent);
    }
}