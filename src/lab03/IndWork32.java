package lab03;

import java.util.Scanner;

public class IndWork32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("Двоичное представление введенного числа: " + binaryNumber);
    }

    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        } else if (decimalNumber == 1) {
            return "1";
        } else {
            int remainder = decimalNumber % 2;
            int quotient = decimalNumber / 2;
            String recursiveResult = convertToBinary(quotient);
            return recursiveResult + remainder;
        }
    }
}
