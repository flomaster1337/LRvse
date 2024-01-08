package LR1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numminus, numplus, sum, kvadrat;
        System.out.println("Напишите ваше число");
        int num = in.nextInt();
        kvadrat = 2;
        numminus = num - 1;
        numplus = num + 1;
        sum = numminus + num + numplus;
        System.out.println("Если вычитаем 1, то " + numminus);
        System.out.println("Число которое написали = " + num);
        System.out.println("Если плюсуем 1, то " + numplus);
        System.out.printf("В квадрате сумма этих чисел равняется %.0f \n", Math.pow(sum, kvadrat));
        in.close();

    }
}