package LR3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        int sum = 0;
        int number;
        int numbersCount = 0;

        System.out.println("Числа, которые суммируются:");

        // Использование оператора цикла for
        for (number = 1; numbersCount < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                sum += number;
                System.out.println(number);
                numbersCount++;
            }
        }

        System.out.println("Сумма чисел: " + sum);

        sum = 0;
        numbersCount = 0;
        number = 1;

        System.out.println("Числа, которые суммируются:");

        // Использование оператора цикла while
        while (numbersCount < count) {
            if (number % 5 == 2 || number % 3 == 1) {
                sum += number;
                System.out.println(number);
                numbersCount++;
            }
            number++;
        }

        System.out.println("Сумма чисел: " + sum);

        sum = 0;
        numbersCount = 0;
        number = 1;

        System.out.println("Числа, которые суммируются:");

        // Использование оператора цикла do-while
        do {
            if (number % 5 == 2 || number % 3 == 1) {
                sum += number;
                System.out.println(number);
                numbersCount++;
            }
            number++;
        } while (numbersCount < count);

        System.out.println("Сумма чисел: " + sum);
    }
}