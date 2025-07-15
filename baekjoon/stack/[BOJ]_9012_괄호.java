package baekjoon.stack;

import java.io.*;
import java.util.*;

public class [BOJ]_9012_괄호 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            String line = br.readLine();
            boolean isValid = true;

            for (char c : line.toCharArray()) {
                switch (c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            isValid  = false;
                            break;
                        }
                        stack.pop();
                        break;
                }
            }
            if (stack.isEmpty() && isValid ) {
                sb.append("YES").append('\n');
                continue;
            }
            sb.append("NO").append('\n');
        }
        System.out.println(sb);
    }
}