package lab01;

import java.util.Scanner;

public class IndWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц(название): ");
        String month = in.nextLine();
        System.out.println("Введите кол-во дней в указанном месяце: ");
        int day = in.nextInt();
        System.out.println("Выбранный месяц - " + month + ", содержит дней - " + day);
        in.close();
    }
}
