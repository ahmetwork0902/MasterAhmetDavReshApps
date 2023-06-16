package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        for (int k = 2; k <= 36; k++) {
            BigInteger decimalNumber = convertToDecimal(number, k);
            BigInteger kMinusOne = BigInteger.valueOf(k - 1);

            if (decimalNumber.mod(kMinusOne).equals(BigInteger.ZERO)) {
                System.out.println(k);
                return;
            }
        }

        System.out.println("No solution.");
    }

    private static BigInteger convertToDecimal(String number, int base) {
        BigInteger result = BigInteger.ZERO;
        BigInteger baseValue = BigInteger.valueOf(base);

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            int digit = Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;
            result = result.multiply(baseValue).add(BigInteger.valueOf(digit));
        }

        return result;
    }
}

