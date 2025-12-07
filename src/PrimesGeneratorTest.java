import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int N = 10;
        PrimesGenerator generator = new PrimesGenerator(N);

        List<Integer> primes = new ArrayList<>();
        while (generator.hasNext()) {
            primes.add(generator.next());
        }

        System.out.println("Прямой порядок:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

        System.out.println("Обратный порядок:");
        Collections.reverse(primes);
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}