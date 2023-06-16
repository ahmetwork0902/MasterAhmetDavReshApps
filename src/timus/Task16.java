package timus;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Создаем трехмерный массив для хранения количества способов
        int[][][] dp = new int[N + 1][A + 1][B + 1];

        // Инициализируем базовые случаи
        dp[0][0][0] = 1;

        // Вычисляем количество способов для каждой комбинации шаров и коробок
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= A; j++) {
                for (int k = 0; k <= B; k++) {
                    // Если коробка пустая, просто копируем количество способов из предыдущей комбинации
                    if (j == 0 && k == 0) {
                        dp[i][j][k] = 1;
                    } else {
                        // Количество способов равно сумме способов, когда кладем красные и синие шары отдельно,
                        // и способов, когда кладем оба вида шаров вместе
                        if (i > 0 && j > 0) {
                            dp[i][j][k] += dp[i - 1][j - 1][k];
                        }
                        if (i > 0 && k > 0) {
                            dp[i][j][k] += dp[i - 1][j][k - 1];
                        }
                    }
                }
            }
        }

        // Выводим количество способов для заданной комбинации шаров и коробок
        System.out.println(dp[N][A][B]);
    }
}

