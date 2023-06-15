package lab03.IndWork36;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        int N = 10; // Количество человек в кругу
        List<Integer> people = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int currentIndex = 0;
        while (people.size() > 1) {
            // Вычисление индекса следующего человека для удаления
            currentIndex = (currentIndex + 1) % people.size();
            people.remove(currentIndex);
        }

        System.out.println("Остался человек с номером: " + people.get(0));
    }
}
