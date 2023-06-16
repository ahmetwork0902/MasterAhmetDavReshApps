package timus;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt(); // Количество групп избирателей
        int[] groupSizes = new int[K]; // Массив размеров групп избирателей

        for (int i = 0; i < K; i++) {
            groupSizes[i] = scanner.nextInt();
        }

        int totalVoters = 0; // Общее количество голосующих избирателей
        int minSupporters = 0; // Минимальное количество сторонников партии

        for (int i = 0; i < K; i++) {
            totalVoters += groupSizes[i];
        }

        int halfGroups = totalVoters / 2;

        for (int i = 0; i < K; i++) {
            if (groupSizes[i] > halfGroups) {
                minSupporters += (groupSizes[i] - halfGroups);
            } else {
                halfGroups -= groupSizes[i];
            }
        }

        System.out.println(minSupporters);
    }
}

