public class Main {
    public static void main(String[] args) {
        FileAnalyzer analyzer = new FileAnalyzer();

        System.out.println("Анализ файла test.txt:");
        analyzer.analyze("test.txt");

        System.out.println("\nАнализ несуществующего файла:");
        analyzer.analyze("no_file.txt");
    }
}