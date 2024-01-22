package LR3;

import java.util.Scanner;

public class Example4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        System.out.println("Все целые числа от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}