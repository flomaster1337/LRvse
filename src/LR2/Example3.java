package LR2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.println("Введенное число удовлетворяет указанным критериям.");
        } else {
            System.out.println("Введенное число не удовлетворяет указанным критериям.");
        }
    }
}