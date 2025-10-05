package programmers.level3;

import java.util.Stack;

public class [PGS]_푸드_파이트_대회 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 6};
        System.out.println(Solution.solution(a));
    }

    static class Solution {
        public static String solution(int[] food) {
            StringBuilder answer = new StringBuilder();
            Stack<Integer> stack = new Stack<>();

            for (int i = 1; i < food.length; i++) {
                int count = food[i];
                for (int j = 0; j < count / 2; j++) {
                    answer.append(i);
                    stack.push(i);
                }
            }

            answer.append(0);
            while (!stack.isEmpty()) {
                answer.append(stack.pop());
            }

            return answer.toString();
        }
    }
}
