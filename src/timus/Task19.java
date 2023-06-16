package timus;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long low = 1;
        long high = N;
        long result = N;

        while (low <= high) {
            long mid = (low + high) / 2;
            long totalCopies = (mid * (mid + 1)) / 2;

            if (totalCopies >= N - K) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(result);
    }
}