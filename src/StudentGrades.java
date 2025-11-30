import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class StudentGrades {
    private Map<String, Double> students = new HashMap<>();

    public void analyze(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length < 2) continue;

                String name = parts[0];
                int sum = 0;

                for (int i = 1; i < parts.length; i++) {
                    sum += Integer.parseInt(parts[i]);
                }

                double average = (double) sum / (parts.length - 1);
                students.put(name, average);
            }

            reader.close();

            // Вывод результатов
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("Файл не найден или ошибка чтения!");
        }
    }

    public String bestStudent() {
        if (students.isEmpty()) return "Нет данных";

        String bestName = "";
        double bestGrade = 0;

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() > bestGrade) {
                bestGrade = entry.getValue();
                bestName = entry.getKey();
            }
        }

        return bestName;
    }

    public String worstStudent() {
        if (students.isEmpty()) return "Нет данных";

        String worstName = "";
        double worstGrade = 5.0;

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() < worstGrade) {
                worstGrade = entry.getValue();
                worstName = entry.getKey();
            }
        }

        return worstName;
    }
}