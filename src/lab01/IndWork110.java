package lab01;

import java.util.Scanner;

public class IndWork110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        int plus = num1 + num2;
        int minus = num1 - num2;
        System.out.println("Сумма двух чисел: " + plus);
        System.out.println("Разность двух чисел: " + minus);
        in.close();
    }
}
