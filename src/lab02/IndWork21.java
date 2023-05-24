package lab02;

import java.util.Arrays;
import java.util.Random;

public class IndWork21 {
    public static void main(String[] args) {
        //Создание массива с нужным размером:
        int size = 10;
        int[] array = new int[size];

        Random random = new Random();
        // Заполнение массива случайными целыми числами от 0 до 999:
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        // Первый элемент массива как начальное минимальное значение
        int minValue = array[0];
        // Массив для хранения индексов минимальных элементов
        int[] minIndices = new int[size];
        // Количество минимальных элементов
        int minCount = 0;

        // Поиск минимального значения и его индексов
        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minCount = 1;
                minIndices[0] = i;
            } else if (array[i] == minValue) {
                minIndices[minCount] = i;
                minCount++;
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы мин. элементов: ");
        for (int i = 0; i < minCount; i++) {
            System.out.print(minIndices[i] + " ");
        }
    }
}
