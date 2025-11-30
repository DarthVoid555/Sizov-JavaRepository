public class Main {
    public static void main(String[] args) {
        Balance scales = new Balance();

        scales.addLeft(120);
        scales.addRight(220);
        System.out.println(scales.result());
        scales.addLeft(100);
        System.out.println(scales.result());
        scales.addLeft(1000);
        System.out.println(scales.result());
        scales.reset();
        scales.addLeft(120);
        System.out.println(scales.result());
    }
}