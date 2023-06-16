package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task15 {
    private static List<List<Integer>> graph;
    private static boolean[] visited;
    private static int[] groups;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        graph = new ArrayList<>(N + 1);
        visited = new boolean[N + 1];
        groups = new int[N + 1];

        // Инициализация графа
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // Считывание связей друзей
        for (int i = 1; i <= N; i++) {
            while (true) {
                int friend = scanner.nextInt();
                if (friend == 0) {
                    break;
                }
                graph.get(i).add(friend);
            }
        }

        // Запуск DFS для каждой непосещенной вершины
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i, 0);
            }
        }

        // Проверка наличия решения
        List<Integer> group1 = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (groups[i] == 0) {
                group1.add(i);
            }
        }

        if (group1.size() == 0) {
            System.out.println("0");
        } else {
            System.out.println(group1.size());
            for (int member : group1) {
                System.out.print(member + " ");
            }
        }
    }

    private static void dfs(int node, int group) {
        visited[node] = true;
        groups[node] = group;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, 1 - group);
            }
        }
    }
}
