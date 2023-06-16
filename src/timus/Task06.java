package timus;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Количество цифр в билете
        int sum = scanner.nextInt(); // Сумма цифр

        int[][] dp = new int[N + 1][sum + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= sum; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (j >= k) {
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }

        int count = dp[N][sum];
        System.out.println(count);
    }
}

