import java.io.BufferedReader;
import java.io.FileReader;

public class FileAnalyzer {

    public void analyze(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            int lines = 0;
            int words = 0;
            int chars = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;

                // Считаем слова
                String[] wordArray = line.split(" ");
                for (String word : wordArray) {
                    if (!word.isEmpty()) {
                        words++;
                    }
                }

                // Считаем символы (без пробелов)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        chars++;
                    }
                }
            }

            reader.close();

            System.out.println("Строк: " + lines);
            System.out.println("Слов: " + words);
            System.out.println("Символов: " + chars);

        } catch (Exception e) {
            System.out.println("Файл не найден!");
        }
    }
}