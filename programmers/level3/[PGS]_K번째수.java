package programmers.level3;

import java.util.Arrays;

public class [PGS]_K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };
        int[] ans = Solution.solution(array, commands);
        System.out.println(Arrays.toString(ans));
    }

    static class Solution {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int c = 0;
            for (int[] command : commands) {
                int i = command[0];
                int j = command[1];
                int k = command[2];
                int[] slice = Arrays.copyOfRange(array, i - 1, j);
                Arrays.sort(slice);
                answer[c++] = slice[k - 1];
            }
            return answer;
        }
    }
}
