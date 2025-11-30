import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer>numbers;
    private List<Integer>even;
    private List<Integer>odd;

    public OddEvenSeparator(){
        this.numbers = new ArrayList<>();
        this.even = new ArrayList<>();
        this.odd = new ArrayList<>();
    }
    public void addNumber(int n){
        numbers.add(n);
        if (n%2==0){
            even.add(n);
        } else {
            odd.add(n);
        }
    }

    public void even(){
        System.out.println("Чётные: "+ even);
    }
    public void odd(){
        System.out.println("Нечётные: "+ odd);
    }
}