package Timus.task_1293;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task_1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b;

        out.println(sum);
        out.flush();
    }
}