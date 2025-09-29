package programmers.level3;

public class [PGS]_최소직사각형 {
    public static void main(String[] args) {
        int[][] a = { {60, 50}, {30, 70}, {60, 30}, {80, 40} };
        System.out.println(Solution.solution(a));
    }

    static class Solution {
        public static int solution(int[][] sizes) {
            int maxX = 0;
            int maxY = 0;

            for (int[] size : sizes) {
                int longer = Math.max(size[0], size[1]);
                int shorter = Math.min(size[0], size[1]);

                maxX = Math.max(maxX, longer);
                maxY = Math.max(maxY, shorter);
            }

            return maxX * maxY;
        }
    }
}