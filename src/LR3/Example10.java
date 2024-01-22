package LR3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int size = 10; // размер массива

        // Создаем массив
        int[] array = new int[size];

        // Заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // генерируем случайное число от 0 до 99
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Сортируем массив в порядке убывания значений
        Arrays.sort(array);
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Выводим отсортированный массив
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array));
    }
}