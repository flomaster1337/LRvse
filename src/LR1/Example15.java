package LR1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum, raznost;
        System.out.println("Напишите первое число");
        int First = in.nextInt();
        System.out.println("Напишите второе число");
        int Second = in.nextInt();
        sum = First + Second;
        raznost = First - Second;
        System.out.println("Сумма этих чисел = " + sum);
        System.out.println("Разность этих чисел = " + raznost);
        in.close();

    }
}