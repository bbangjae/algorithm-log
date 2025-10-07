package programmers.level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class [PGS]_명예의_전당_(1) {

    int[] arr = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };

    System.out.println(Arrays.toString(Solution.solution(4, arr)));

}

    static class Solution {
        public static int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];

            PriorityQueue<Integer> queue = new PriorityQueue<>();

            for (int i = 0; i < score.length; i++) {
                if (queue.size() < k) {
                    queue.add(score[i]);
                    answer[i] = queue.peek();
                    continue;
                }

                queue.add(score[i]);
                queue.poll();
                answer[i] = queue.peek();
            }

            return answer;
        }
    }
}