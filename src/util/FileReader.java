package util;
import java.io.*;
import java.util.*;
public class FileReader {
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                content.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
