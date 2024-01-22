package LR3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Ошибка! Введите положительное число.");
            return;
        }

        int[] array = new int[size];
        int counter = 0;
        int number = 2;

        while (counter < size) {
            if (number % 5 == 2) {
                array[counter] = number;
                counter++;
            }
            number++;
        }

        System.out.println("Результирующий массив:");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
