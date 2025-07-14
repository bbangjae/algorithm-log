package baekjoon.stack;

import java.io.*;
import java.util.*;

public class [BOJ]_10828_스택 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }
                    sb.append(stack.pop()).append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append('\n');
                        break;
                    }
                    sb.append(0).append('\n');
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }
                    sb.append(stack.peek()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}