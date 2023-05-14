package lab01;

import java.util.Scanner;

public class IndWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Человек по имени " + name + "имеет возраст равный - " + age);
        in.close();
    }
}
