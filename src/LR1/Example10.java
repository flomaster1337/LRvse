package LR1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentyear;
        currentyear = 2023;
        System.out.println("Напишите в каком году вы родились");
        int year = in.nextInt();
        currentyear = currentyear - year;
        System.out.println("Вам " + currentyear + " лет");
        in.close();

    }
}