package timus;

import java.util.*;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] rabbits = new int[N][2];
        for (int i = 0; i < N; i++) {
            rabbits[i][0] = scanner.nextInt();
            rabbits[i][1] = scanner.nextInt();
        }

        int maxCount = 2; // Минимальное количество точек на одной прямой

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int count = 2; // Уже имеем две точки (i и j)

                for (int k = j + 1; k < N; k++) {
                    // Проверяем, лежит ли точка k на прямой, проходящей через точки i и j
                    if ((rabbits[j][1] - rabbits[i][1]) * (rabbits[k][0] - rabbits[i][0]) ==
                            (rabbits[k][1] - rabbits[i][1]) * (rabbits[j][0] - rabbits[i][0])) {
                        count++;
                    }
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        System.out.println(maxCount);
    }
}

