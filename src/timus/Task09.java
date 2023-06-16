import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    dp[i] = dp[i / 2];
                } else {
                    dp[i] = dp[i / 2] + dp[i / 2 + 1];
                }
            }

            int max_value = 0;
            for (int i = 0; i <= n; i++) {
                max_value = Math.max(max_value, dp[i]);
            }

            System.out.println(max_value);
        }
    }
}
