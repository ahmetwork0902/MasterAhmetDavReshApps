package lab02;

import java.util.Scanner;
public class IndWork23 {
    public static void main(String[] args) {
        //Получение вводных данных с клавиатуры:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        // Выполнение шифрования текста:
        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        scanner.nextLine();
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            // Дешифрование текста
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ!");
        }
    }
    public static String encrypt(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                // Преобразование символа по кодовой таблице
                char shifted = (char) (ch + key);
                if (Character.isUpperCase(ch) && shifted > 'Z') {
                    shifted = (char) (shifted - 26);
                } else if (Character.isLowerCase(ch) && shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }
                encrypted.append(shifted);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }
    public static String decrypt(String text, int key) {
        // Дешифрование текста
        return encrypt(text, -key);
    }
}
