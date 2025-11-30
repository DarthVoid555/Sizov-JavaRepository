public class Button {
    public int count;

    public Button(){
        this.count=0;
    }

    public void click(){
        count++;
        System.out.println("Количество нажатий: " + count);
    }

    public int getCount()
    {
        return count;
    }

    public void reset(){
        count=0;
        System.out.println("Счётчик сброшен. Количество нажатий: 0");
    }
}