package LR3;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        // Задаем размер массива
        int size = 10;

        // Создаем массив
        int[] array = new int[size];

        // Заполняем массив случайными числами
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Выводим массив на консоль
        System.out.println("Массив: " + Arrays.toString(array));

        // Находим минимальный элемент и его индексы
        int minValue = array[0];
        int[] minIndexes = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                count = 0;
            }
            if (array[i] == minValue) {
                minIndexes[count++] = i;
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы минимального значения: ");
        for (int i = 0; i < count; i++) {
            System.out.print(minIndexes[i] + " ");
        }
    }
}