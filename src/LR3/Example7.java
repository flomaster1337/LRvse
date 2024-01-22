package LR3;

public class Example7 {

    public static void main(String[] args) {
        int size = 10;
        char[] letters = new char[size];

        char currentLetter = 'а';
        for (int i = 0; i < size; i++) {
            letters[i] = currentLetter;
            currentLetter += 2;
        }

        // Вывод в прямом порядке
        System.out.print("Прямой порядок: ");
        for (int i = 0; i < size; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        // Вывод в обратном порядке
        System.out.print("Обратный порядок: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}