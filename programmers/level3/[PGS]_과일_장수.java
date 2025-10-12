package programmers.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class [PGS]_과일_장수 {
    public static void main(String[] args) {

        int[] scores = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };

        System.out.println("Solution.solution(3, 4, scores) = " + Solution.solution(4, 3, scores));
        System.out.println("Solution.solution2(3, 4, scores) = " + Solution.solution2(4, 3, scores));
    }

    static class Solution {
        public static int solution(int k, int m, int[] scores) {
            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();
            for (int score : scores) {

                map.put(score, map.getOrDefault(score, 0) + 1);
            }

            int remain = 0;

            for (int i = k; i > 0; i-- ) {

                if (!map.containsKey(i)) {
                    continue;
                }

                int currentAppleCount = map.get(i) + remain;

                int currentBoxCount = currentAppleCount / m;

                if (currentBoxCount == 0) {
                    remain = currentAppleCount;
                    continue;
                }
                remain = currentAppleCount % m;
                answer += i * m * currentBoxCount;
            }
            return answer;
        }

        public static int solution2(int k, int m, int[] scores) {
            int answer = 0;

            Integer[] arr = Arrays.stream(scores).boxed().toArray(Integer[]::new);
            Arrays.sort(arr, Collections.reverseOrder());

            int boxCount = arr.length / m;

            for (int i = 1; i <= boxCount; i++) {
                answer += arr[i * m - 1] * m;
            }
            return answer;
        }
    }
}
