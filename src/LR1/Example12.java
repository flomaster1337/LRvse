package LR1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentyear;
        currentyear = 2023;
        System.out.println("Напишите сколько вам лет");
        int year = in.nextInt();
        currentyear = currentyear - year;
        System.out.println("Вы родились в " + currentyear + " году");
        in.close();

    }
}