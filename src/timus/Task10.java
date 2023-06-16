package timus;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();

        long[] dp = new long[N + 1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        if (K > dp[N]) {
            System.out.println("-1");
        } else {
            StringBuilder sequence = new StringBuilder();
            int prevBit = 0;
            for (int i = N; i >= 1; i--) {
                if (K <= dp[i]) {
                    sequence.append("0");
                    prevBit = 0;
                } else {
                    sequence.append("1");
                    K -= dp[i];
                    prevBit = 1;
                }
            }

            // Reverse the sequence and add an extra bit at the beginning if necessary
            sequence.reverse();
            if (prevBit == 1) {
                sequence.insert(0, "0");
            }

            System.out.println(sequence.toString());
        }
    }
}
