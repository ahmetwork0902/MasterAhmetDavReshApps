package timus;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        double[][] vertices = new double[N][2];
        for (int i = 0; i < N; i++) {
            vertices[i][0] = scanner.nextDouble();
            vertices[i][1] = scanner.nextDouble();
        }

        double minLength = Double.POSITIVE_INFINITY;

        for (int i = 1; i < N - 1; i++) {
            double[] p1 = vertices[i];
            double[] p2 = vertices[i + 1];

            double[] v1 = {p2[0] - p1[0], p2[1] - p1[1]};

            for (int j = 1; j < N - 1; j++) {
                double[] q1 = vertices[j];
                double[] q2 = vertices[j + 1];

                double[] v2 = {q2[0] - q1[0], q2[1] - q1[1]};

                double[] n1 = {-v1[1], v1[0]}; // перпендикуляр к v1
                double[] n2 = {-v2[1], v2[0]}; // перпендикуляр к v2

                double det = v1[0] * v2[1] - v1[1] * v2[0];

                if (Math.abs(det) < 1e-9) continue; // прямые параллельны

                double t = (n2[0] * (q1[0] - p1[0]) + n2[1] * (q1[1] - p1[1])) / det;

                double[] intersection = {p1[0] + t * v1[0], p1[1] + t * v1[1]};

                // Проверяем, что точка пересечения лежит на отрезках p1-p2 и q1-q2
                if (t >= 0 && t <= 1 && isBetween(intersection, p1, p2) && isBetween(intersection, q1, q2)) {
                    double area1 = getTriangleArea(p1, intersection, q1);
                    double area2 = getTriangleArea(p2, intersection, q2);

                    if (Math.abs(area1 - area2) < 1e-9) {
                        minLength = Math.min(minLength, distance(p1, intersection));
                    }
                }
            }
        }

        System.out.printf("%.4f\n", minLength);
    }

    // Проверяет, лежит ли точка C между точками A и B
    public static boolean isBetween(double[] C, double[] A, double[] B) {
        double dotProduct = (C[0] - A[0]) * (B[0] - A[0]) + (C[1] - A[1]) * (B[1] - A[1]);
        return dotProduct >= 0 && dotProduct <= (B[0] - A[0]) * (B[0] - A[0]) + (B[1] - A[1]) * (B[1] - A[1]);
    }

    // Вычисляет площадь треугольника, заданного тремя точками A, B и C
    public static double getTriangleArea(double[] A, double[] B, double[] C) {
        return 0.5 * Math.abs(A[0] * (B[1] - C[1]) + B[0] * (C[1] - A[1]) + C[0] * (A[1] - B[1]));
    }

    // Вычисляет расстояние между двумя точками A и B
    public static double distance(double[] A, double[] B) {
        double dx = A[0] - B[0];
        double dy = A[1] - B[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}

