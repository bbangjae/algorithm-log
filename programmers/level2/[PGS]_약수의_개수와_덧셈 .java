package programmers.level2;

public class [PGS]_약수의_개수와_덧셈 {
    public static void main(String[] args) {

        System.out.println(Solution.solution(13, 17));
    }

    static class Solution {
        static public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                int count = 0;

                for(int j = 1; j <= i; j ++) {
                    if (i % j == 0)
                        count++;
                }

                if (count % 2 == 0)
                    answer += i;
                else
                    answer -= i;

            }
            return answer;
        }
    }
}


