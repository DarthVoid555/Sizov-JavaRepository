import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog. " +
                "The dog barks at the fox, but the fox runs away. " +
                "Quick and brown, the fox is fast!";

        Map<String, Integer> wordFrequency = getWordFrequency(text);

        System.out.println("Частота слов в тексте:");
        System.out.println("======================");

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nОтсортировано по частоте:");
        System.out.println("=========================");

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Разделяем текст на слова (убираем знаки препинания)
        String[] words = text.toLowerCase().split("[^a-zA-Z]+");

        for (String word : words) {
            if (!word.isEmpty()) { // игнорируем пустые строки
                // Увеличиваем счетчик для этого слова
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
}