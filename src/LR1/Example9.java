package LR1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите месяц");
        String month = in.nextLine();
        System.out.println("Напишите сколько дней в этом месяце");
        int monthday = in.nextInt();
        System.out.println("В " + month + " " + monthday + " Дней");
        in.close();

    }
}