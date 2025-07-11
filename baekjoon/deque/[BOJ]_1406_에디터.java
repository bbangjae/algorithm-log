package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class [BOJ]_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            left.offerLast(line.charAt(i));
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();

            if (cmd.charAt(0) == 'L') {
                if (!left.isEmpty()) {
                    right.offerFirst(left.pollLast());
                }
                continue;
            }

            if (cmd.charAt(0) == 'D') {
                if (!right.isEmpty()) {
                    left.offerLast(right.pollFirst());
                }
                continue;
            }

            if (cmd.charAt(0) == 'B') {
                if (!left.isEmpty()) {
                    left.removeLast();
                }
                continue;
            }

            if (cmd.charAt(0) == 'P') {
                left.offerLast(cmd.charAt(2));
            }
        }

        for (char c : left) {
            sb.append(c);
        }

        for (char c : right) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}

