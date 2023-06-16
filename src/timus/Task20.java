package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> group = new ArrayList<>();
            group.add(scanner.nextInt());
            groups.add(group);
        }

        for (int i = 0; i < K; i++) {
            int groupNum = scanner.nextInt();
            int numSubgroups = scanner.nextInt();

            for (int j = 0; j < numSubgroups; j++) {
                List<Integer> subgroup = new ArrayList<>();
                subgroup.add(scanner.nextInt());
                subgroup.add(scanner.nextInt());
                groups.get(groupNum - 1).add(groupNum);
            }
        }

        int totalHandshakes = countHandshakes(groups, 0);
        System.out.println(totalHandshakes);
    }

    private static int countHandshakes(List<List<Integer>> groups, int groupNum) {
        List<Integer> group = groups.get(groupNum);
        int handshakes = group.get(0);

        for (int i = 1; i < group.size(); i++) {
            int subgroupNum = group.get(i);
            handshakes += countHandshakes(groups, subgroupNum - 1);
        }

        return handshakes;
    }
}
