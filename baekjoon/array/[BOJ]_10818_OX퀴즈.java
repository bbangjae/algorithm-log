package baekjoon;

import java.io.*;

public class [BOJ]_10818_OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            int sum = 0;
            int plus = 1;

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') {
                    sum += plus;
                    plus++;
                }
                if (line.charAt(j) == 'X') {
                    plus = 1;
                }
            }
            arr[i] = sum;
        }
        br.close();

        for (int sum : arr) {
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}
