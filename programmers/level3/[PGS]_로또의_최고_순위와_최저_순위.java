package programmers.level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class [PGS]_로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {

        int[] lottos = { 44, 1, 0, 0, 31, 25 };
        int[] win_nums = { 31, 10, 45, 1, 6, 19 };

        System.out.println("Solution.solution(lottos, win_nums) = " + Arrays.toString(Solution.solution(lottos, win_nums)));
    }

    static class Solution {
        public static int[] solution(int[] lottos, int[] win_nums) {
            int maxMatchCount = 0;
            int minMatchCount = 0;

            Set<Integer> set = new HashSet<>();

            for (int num : win_nums) {
                set.add(num);
            }

            for (int num : lottos) {
                if (num == 0) {
                    maxMatchCount++;
                    continue;
                }

                if (set.contains(num)) {
                    maxMatchCount++;
                    minMatchCount++;
                }
            }

            return new int[]{ rank(maxMatchCount), rank(minMatchCount) };
        }

        private static int rank(int count) {
            return switch (count) {
                case 2 -> 5;
                case 3 -> 4;
                case 4 -> 3;
                case 5 -> 2;
                case 6 -> 1;
                default -> 6;
            };
        }
    }
}