package LR3;

import java.util.Scanner;

public class Example3For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        int first = 1;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}