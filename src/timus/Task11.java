package timus;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] jumps = new int[K];

        for (int i = 0; i < K; i++) {
            int[] row = new int[N];
            for (int j = 0; j < N; j++) {
                row[j] = scanner.nextInt();
            }
            jumps[i] = calculateJumps(row);
        }

        int maxJumps = jumps[0];
        int maxJumpsIndex = 0;

        for (int i = 1; i < K; i++) {
            if (jumps[i] > maxJumps) {
                maxJumps = jumps[i];
                maxJumpsIndex = i;
            }
        }

        System.out.println(maxJumpsIndex + 1);
    }

    private static int calculateJumps(int[] row) {
        int jumps = 0;
        int[] jumpsCount = new int[row.length];

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < i; j++) {
                if (row[j] > row[i]) {
                    jumpsCount[row[j] - 1]++;
                }
            }
        }

        for (int count : jumpsCount) {
            jumps += count;
        }

        return jumps;
    }
}
