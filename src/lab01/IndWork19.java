package lab01;

import java.util.Scanner;

public class IndWork19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        int minus= num - 1;
        int plus = 1 + num;
        int sum = plus + minus + num;
        int kvad = (int) Math.pow (sum, 2);;
        System.out.println(minus + ", " + num + ", " + plus + ", " + kvad);
        in.close();
    }
}
