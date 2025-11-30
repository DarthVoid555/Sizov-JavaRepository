public class Main {
    public static void main(String[] args) {
        OddEvenSeparator sep = new OddEvenSeparator();
        sep.addNumber(1);
        sep.addNumber(6);
        sep.addNumber(12);
        sep.addNumber(9);
        sep.addNumber(121);
        sep.addNumber(18);
        sep.addNumber(3);
        sep.addNumber(17);
        sep.addNumber(77);
        
        sep.even();
        sep.odd();

    }
}