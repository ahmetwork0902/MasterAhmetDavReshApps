package timus;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalSalary = scanner.nextLine();

        String palindromeSalary = makePalindrome(originalSalary);

        System.out.println(palindromeSalary);
    }

    private static String makePalindrome(String originalSalary) {
        StringBuilder palindrome = new StringBuilder(originalSalary);

        // Добавляем символы в зеркальном порядке, начиная с последнего символа
        for (int i = originalSalary.length() - 2; i >= 0; i--) {
            palindrome.append(originalSalary.charAt(i));
        }

        return palindrome.toString();
    }
}
