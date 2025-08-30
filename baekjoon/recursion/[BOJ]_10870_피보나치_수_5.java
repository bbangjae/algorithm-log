package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class [BOJ]_10870_피보나치_수_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 1)
            return 1;

        if (n == 0)
            return 0;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
