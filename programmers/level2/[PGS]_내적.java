package programmers.level2;

public class [PGS]_내적 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { -1, 2, 3, 5, 2, 6, 3, 8, 9, 1 };

        System.out.println(Solution.solution(a, b));
    }

    static class Solution {
        static public int solution(int[] a, int[] b) {
            int answer = 0;

            for(int i = 0; i < a.length; i++) {
                answer += a[i] * b[i];
            }
            return answer;
        }
    }
}


