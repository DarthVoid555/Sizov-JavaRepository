package isp;

public class ModernScanner implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Сканирую: " + document);
    }
}