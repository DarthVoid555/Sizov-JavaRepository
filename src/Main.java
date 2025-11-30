public class Main {
    public static void main(String[] args) {
        Button myButton = new Button();

        myButton.click();
        myButton.click();
        myButton.click();
        myButton.click();
        myButton.click();
        myButton.click();

        System.out.println("Общее количество нажатий: " + myButton.getCount() );

        myButton.reset();
        myButton.click();
        myButton.click();
    }
}