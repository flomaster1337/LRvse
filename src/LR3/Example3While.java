package LR3;

import java.util.Scanner;

public class Example3While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        int first = 1;
        int second = 1;
        int i = 2;

        System.out.print(first + " " + second + " ");

        while (i < count) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;

            i++;
        }
    }
}