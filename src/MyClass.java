public class MyClass {
    private String name;
    private int value;

    public MyClass() {
        this.name = "Default";
        this.value = 100;
    }

    public MyClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void publicMethod1() {
        System.out.println("Public method 1");
    }

    public String publicMethod2(String text) {
        return "Public method 2: " + text;
    }

    @Repeat(times = 2)
    protected void protectedMethod1() {
        System.out.println("Protected method 1");
    }

    @Repeat(times = 3)
    protected String protectedMethod2(String prefix) {
        String result = prefix + " - protected method 2";
        System.out.println("Protected method 2: " + result);
        return result;
    }

    @Repeat(times = 4)
    private void privateMethod1() {
        System.out.println("Private method 1 - name: " + name);
    }

    @Repeat(times = 2)
    private int privateMethod2(int x, int y) {
        int result = x + y + value;
        System.out.println("Private method 2: " + x + " + " + y + " + " + value + " = " + result);
        return result;
    }

    @Repeat(times = 3)
    private String privateMethod3(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text).append(" ");
        }
        System.out.println("Private method 3: " + result);
        return result.toString().trim();
    }

    public String getName() { return name; }
    public int getValue() { return value; }
}