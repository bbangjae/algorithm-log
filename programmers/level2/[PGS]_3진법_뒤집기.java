package programmers.level2;

import java.util.*;

public class [PGS]_3진법_뒤집기 {
    public static void main(String[] args) {

        System.out.println(Solution.solution(45));
    }

    static class Solution {
        public static int solution(int n) {
            int answer = 0;

            Deque<Integer> stack = new ArrayDeque<>();
            while (n != 0) {
                stack.push(n % 3);
                n = n / 3;
            }

            int size = stack.size();
            for (int i = 0; i < size; i++) {
                answer += (int) (stack.pop() * Math.pow(3, i));
            }
            return answer;
        }
    }
}
