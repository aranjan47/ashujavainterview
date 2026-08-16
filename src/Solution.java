import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(integerSqrt(n));
    }

    public static long integerSqrt(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n < 2) {
            return n;
        }

        long low = 1;
        long high = n;
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}