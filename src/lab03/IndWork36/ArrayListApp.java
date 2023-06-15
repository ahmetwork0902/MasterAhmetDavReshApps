package lab03.IndWork36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        // Количество человек в кругу
        int N = 10;
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }
        // Вычисление индекса следующего человека для удаления
        int currentIndex = 0;
        while (people.size() > 1) {
            currentIndex = (currentIndex + 1) % people.size();
            people.remove(currentIndex);
        }

        System.out.println("Остался человек c номером: " + people.get(0));
    }
}
