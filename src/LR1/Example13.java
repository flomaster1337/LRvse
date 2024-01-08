package LR1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        System.out.println("Напишите первое число");
        int First = in.nextInt();
        System.out.println("Напишите второе число");
        int Second = in.nextInt();
        sum = First + Second;
        System.out.println("Получилось число " + sum);
        in.close();

    }
}