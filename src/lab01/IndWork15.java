package lab01;

import java.util.Scanner;
import java.time.LocalDate;

public class IndWork15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();
        System.out.println("Введите ваш год рождения: ");
        int biryear = in.nextInt();
        int age = year - biryear;
        System.out.println("Ваш возраст: " + age);
        in.close();
    }
}
