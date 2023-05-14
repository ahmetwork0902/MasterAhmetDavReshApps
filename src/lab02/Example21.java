package lab02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива" + size);
        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt();
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
