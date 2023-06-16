package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> enemies = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> enemyList = new ArrayList<>();
            int m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                enemyList.add(scanner.nextInt());
            }
            enemies.add(enemyList);
            scanner.nextLine();
        }

        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();

        group1.add(1); // Ребенок номер 1 всегда в первой группе

        for (int i = 2; i <= n; i++) {
            boolean addedToGroup1 = true;

            for (int j = 0; j < enemies.get(i - 1).size(); j++) {
                int enemy = enemies.get(i - 1).get(j);

                if (group1.contains(enemy)) {
                    addedToGroup1 = false;
                    break;
                }
            }

            if (addedToGroup1) {
                group1.add(i);
            } else {
                group2.add(i);
            }
        }

        if (group1.size() < group2.size()) {
            System.out.println(group1.size());
            printList(group1);
        } else {
            System.out.println(group2.size());
            printList(group2);
        }
    }

    private static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

