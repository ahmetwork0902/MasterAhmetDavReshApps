package lab04;

import java.util.Scanner;

public class IndWork42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите количество столбцов матрицы: ");
            int columns = Integer.parseInt(scanner.nextLine());

            int[][] matrix = new int[rows][columns];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            int columnNumber = Integer.parseInt(scanner.nextLine());

            printMatrixColumn(matrix, columnNumber);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Нет столбца с таким номером.");
        }
    }

    public static void printMatrixColumn(int[][] matrix, int columnNumber) {
        int rows = matrix.length;

        if (rows == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int columns = matrix[0].length;

        if (columnNumber < 0 || columnNumber >= columns) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("Столбец с номером " + columnNumber + ":");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber]);
        }
    }
}

