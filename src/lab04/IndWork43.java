package lab04;

import java.util.Scanner;

public class IndWork43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        try {
            int size = Integer.parseInt(scanner.nextLine());
            byte[] array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = Byte.parseByte(scanner.nextLine());
            }

            int sum = calculateArraySum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за границы диапазона типа byte.");
        }
    }

    public static int calculateArraySum(byte[] array) {
        int sum = 0;

        for (byte num : array) {
            sum += num;
        }

        return sum;
    }
}

