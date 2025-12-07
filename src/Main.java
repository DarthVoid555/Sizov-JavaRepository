import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 1); // Дубликат
        map.put("date", 3);

        System.out.println("Исходная мапа: " + map);

        try {
            Map<Integer, String> swapped = safeSwapMap(map);
            System.out.println("Перевернутая: " + swapped);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        Map<Integer, List<String>> multiValue = swapMapWithLists(map);
        System.out.println("С коллекциями: " + multiValue);
    }


    public static <K, V> Map<V, K> safeSwapMap(Map<K, V> original) {
        Map<V, K> swapped = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            V value = entry.getValue();
            if (swapped.containsKey(value)) {
                throw new IllegalArgumentException(
                        "Дублирующееся значение: " + value +
                                ". Ключи: " + swapped.get(value) + " и " + entry.getKey()
                );
            }
            swapped.put(value, entry.getKey());
        }

        return swapped;
    }


    public static <K, V> Map<V, List<K>> swapMapWithLists(Map<K, V> original) {
        Map<V, List<K>> swapped = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();


            if (!swapped.containsKey(value)) {
                swapped.put(value, new ArrayList<>());
            }
            swapped.get(value).add(key);
        }

        return swapped;
    }
}