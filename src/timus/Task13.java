package timus;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] teams = new int[n][2];
        for (int i = 0; i < n; i++) {
            teams[i][0] = scanner.nextInt(); // ID команды
            teams[i][1] = scanner.nextInt(); // количество решённых задач
        }

        // Пузырьковая сортировка по убыванию количества решённых задач
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams[j][1] < teams[j + 1][1]) {
                    // Обмен значений команд
                    int[] temp = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = temp;
                }
            }
        }

        // Вывод таблицы результатов
        for (int i = 0; i < n; i++) {
            System.out.println(teams[i][0] + " " + teams[i][1]);
        }
    }
}

