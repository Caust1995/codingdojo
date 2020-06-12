package digitalroot;

public class DRoot {
    public static int digital_root(int n) {
        int remaining = n;
        int sum = remaining % 10;
        while (remaining > 9) {
            int nextDigit = (remaining / 10) % 10;
            remaining /= 10;
            sum += nextDigit;
        }
        return sum > 10 ? digital_root(sum) : sum;
    }
}