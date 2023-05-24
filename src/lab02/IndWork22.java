package lab02;

public class IndWork22 {
    public static void main(String[] args) {
        int rows = 9; // Количество строк в двухмерном массиве
        int cols = 9; // Количество столбцов в двухмерном массиве
        // Создание двумерного массива
        int[][] array = new int[rows][cols];
        int count = 1; // Счетчик для заполнения массива
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Заполнение строки слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = count;
                    count++;
                }
            } else { // Заполнение строки справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = count;
                    count++;
                }
            }
        }
        // Вывод массива на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
