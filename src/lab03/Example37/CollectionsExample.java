package lab03.Example37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");

        System.out.println("Исходный список: " + names);

        Collections.sort(names); // Сортировка списка

        System.out.println("Отсортированный список: " + names);
        System.out.println("Количество элементов: " + names.size());
        System.out.println("Список пустой? " + names.isEmpty());
    }
}

