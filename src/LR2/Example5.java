package LR2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Получаем четвертую цифру справа
        int fourthDigit = (number / 1000) % 10;

        System.out.println("Четвертая цифра справа: " + fourthDigit);

        }
}