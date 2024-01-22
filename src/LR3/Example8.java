package LR3;

public class Example8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char currentLetter = 'A';

        for (int i = 0; i < letters.length; i++) {
            // Пропускаем гласные буквы
            if (currentLetter == 'A' || currentLetter == 'E' || currentLetter == 'I' || currentLetter == 'O' || currentLetter == 'U') {
                currentLetter++;
            }

            letters[i] = currentLetter++;
        }

        // Выводим содержимое массива в консольном окне
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}