public class Main {
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        System.out.println("Анализ оценок студентов:");
        grades.analyze("grades.txt");

        System.out.println("\nЛучший студент: " + grades.bestStudent());
        System.out.println("Худший студент: " + grades.worstStudent());
    }
}