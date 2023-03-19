package lab01;

import java.util.Scanner;

public class IndWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String name = in.nextLine();
        System.out.println("Введите имя: ");
        String name2 = in.nextLine();
        System.out.println("Введите отчество: ");
        String name3 = in.nextLine();
        System.out.println("Hello " + name + ", " + name2 + ", " + name3);
        in.close();
    }
}
