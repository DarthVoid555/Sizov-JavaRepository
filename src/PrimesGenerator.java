import java.util.Iterator;

public class PrimesGenerator implements Iterator<Integer> {
    private int needed;
    private int found = 0;
    private int current = 2;

    public PrimesGenerator(int needed) {
        this.needed = needed;
    }

    public boolean hasNext() {
        return found < needed;
    }

    public Integer next() {
        while (!isPrime(current)) {
            current++;
        }
        int prime = current;
        current++;
        found++;
        return prime;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}