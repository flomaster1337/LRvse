package LR1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите день недели:");
        String week = in.nextLine();
        System.out.println("Напишите месяц");
        String mouth = in.nextLine();
        System.out.println("Напишите какое сегодня число");
        int day = in.nextInt();
        System.out.println(week + " " + day + " " + mouth);
        in.close();

    }
}
