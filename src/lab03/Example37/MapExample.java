package lab03.Example37;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 80);
        scores.put("Alice", 95);
        scores.put("Bob", 75);
        scores.put("Eve", 90);

        System.out.println("Оценки: " + scores);

        int aliceScore = scores.get("Alice");
        System.out.println("Оценка Alice: " + aliceScore);

        boolean containsKey = scores.containsKey("Bob");
        boolean containsValue = scores.containsValue(85);
        System.out.println("Отображение содержит ключ 'Bob'? " + containsKey);
        System.out.println("Отображение содержит значение 85? " + containsValue);

        scores.remove("Eve");
        System.out.println("Оценки после удаления записи: " + scores);
        System.out.println("Количество записей: " + scores.size());
    }
}