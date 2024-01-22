import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long K = scanner.nextInt();
        long P = scanner.nextInt();

        long[] dp = new long[(int) (K + 1)];
        dp[0] = 1;

        for (int i = 1; i <= K; i++) {
            dp[i] = (2 * dp[i - 1]) % P;
            if (i >= 7) {
                dp[i] = (dp[i] + dp[i - 7]) % P;
            }
        }

        System.out.println(dp[(int) K]);
    }
}