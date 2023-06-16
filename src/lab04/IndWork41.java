package lab04;

import java.util.Scanner;

import java.util.Scanner;

public class IndWork41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        try {
            int size = Integer.parseInt(scanner.nextLine());
            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            double average = calculateAverage(array);
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Введен отрицательный размер массива.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Несоответствие числового типа данных.");
        } catch (NoPositiveElementsException e) {
            System.out.println("Ошибка: Положительные элементы отсутствуют.");
        }
    }

    public static double calculateAverage(int[] array) throws NoPositiveElementsException {
        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            throw new NoPositiveElementsException();
        }

        return (double) sum / count;
    }
}

class NoPositiveElementsException extends Exception {
    public NoPositiveElementsException() {
        super("Положительные элементы отсутствуют");
    }
}