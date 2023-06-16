package timus;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Количество точек
        int[] values = new int[N]; // Массив значений функции

        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int leftIndex = 0; // Левый указатель
        int rightIndex = 1; // Правый указатель

        double maxSlope = Double.NEGATIVE_INFINITY; // Максимальный угловой коэффициент
        int bestLeftIndex = 0; // Индекс левой точки в паре
        int bestRightIndex = 1; // Индекс правой точки в паре

        while (rightIndex < N) {
            double slope = (double) (values[rightIndex] - values[leftIndex]) / (rightIndex - leftIndex);

            if (slope > maxSlope) {
                maxSlope = slope;
                bestLeftIndex = leftIndex;
                bestRightIndex = rightIndex;
            }

            if (slope <= 0) {
                leftIndex = rightIndex;
            }

            rightIndex++;
        }

        System.out.println((bestLeftIndex + 1) + " " + (bestRightIndex + 1));
    }
}
