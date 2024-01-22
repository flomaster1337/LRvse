package Timus.task_1293;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int numberOfB = b + 1;

        int result = a * numberOfB;

        out.println(result);
        out.flush();
    }
}