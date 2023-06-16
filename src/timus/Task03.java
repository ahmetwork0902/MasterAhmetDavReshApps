package timus;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] stones = {5, 10, 3, 1, 8}; // Веса камней

        int n = stones.length; // Количество камней
        int totalWeight = Arrays.stream(stones).sum(); // Общий вес всех камней

        boolean[][] dp = new boolean[n + 1][totalWeight + 1]; // Таблица для хранения промежуточных результатов

        // Инициализация базовых значений
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Заполнение таблицы с использованием метода динамического программирования
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totalWeight; j++) {
                dp[i][j] = dp[i - 1][j];
                if (stones[i - 1] <= j) {
                    dp[i][j] |= dp[i - 1][j - stones[i - 1]];
                }
            }
        }

        // Находим минимальную разность весов куч
        int minDifference = Integer.MAX_VALUE;
        for (int j = totalWeight / 2; j >= 0; j--) {
            if (dp[n][j]) {
                minDifference = totalWeight - 2 * j;
                break;
            }
        }

        System.out.println("Минимальная разность весов куч: " + minDifference);
    }
}

