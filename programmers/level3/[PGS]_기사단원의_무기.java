package programmers.level3;

public class [PGS]_기사단원의_무기 {
    public static void main(String[] args) {

        System.out.println("Solution.solution(10, 3, 2) = " + Solution.solution(10, 3, 2));

    }

    static class Solution {
        public static int solution(int number, int limit, int power) {
            int answer = 0;

            for (int i = 1; i <= number; i++) {
                int count = 0;

                for (int j = 1; j * j <= i; j++) {
                    if (j * j == i) count++;
                    else if (i % j == 0) count += 2;
                }

                if (count > limit) {
                    answer += power;
                    continue;
                }

                answer += count;
            }
            return answer;
        }
    }
}
