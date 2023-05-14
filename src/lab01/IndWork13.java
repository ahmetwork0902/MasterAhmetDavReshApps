package lab01;

import java.util.Scanner;

public class IndWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели(полностью): ");
        String dayweek = in.nextLine();
        System.out.println("Введите месяц(название): ");
        String month = in.nextLine();
        System.out.println("Введите дату(день месяца): ");
        int day = in.nextInt();
        System.out.println("Сегодня: " + dayweek + ", " + day + ", " + month);
        in.close();
    }
}
