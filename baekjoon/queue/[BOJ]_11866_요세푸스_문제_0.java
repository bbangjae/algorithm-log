package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class [BOJ]_11866_요세푸스_문제_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        Queue<Integer> circle = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            circle.add(i + 1);
        }

        int count = 0;
        while (circle.size() != 1) {
            count++;
            if (count == K) {
                sb.append(circle.poll()).append(", ");
                count = 0;
                continue;
            }
            circle.add(circle.poll());
        }

        sb.append(circle.poll()).append(">");

        System.out.println(sb);
    }
}
