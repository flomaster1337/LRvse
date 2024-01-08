package LR1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input SecondName: ");
        String secondname = in.nextLine();
        System.out.println("Input FirstName: ");
        String name = in.nextLine();
        System.out.println("Input Otchestvo: ");
        String otchestvo = in.nextLine();
        System.out.println("Hello " + secondname + " " + name + " " + otchestvo);
        in.close();

    }
}

