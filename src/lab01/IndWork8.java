package lab01;


import java.util.Scanner;

public class IndWork8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Сумма двух чисел: " + sum);
        in.close();
    }
}
