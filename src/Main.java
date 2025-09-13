public class Main {
    public static void main(String[] args) {
        String name = System.console().readLine("What is your name?\n> ");
        System.out.println("Hello, " + name + "!");
    }
}