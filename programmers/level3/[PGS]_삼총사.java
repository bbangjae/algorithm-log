package programmers.level3;

public class [PGS]_삼총사 {
    public static void main(String[] args) {
        int[] a = { -2, 3, 0, 2, -5 };
        System.out.println(Solution.solution(a));
    }

    static class Solution {
        public static int solution(int[] number) {
            int answer = 0;

            for (int i = 0; i < number.length - 2; i++) {
                int first = number[i];

                for (int j = i + 1; j < number.length - 1; j++) {
                    int second = number[j];

                    for (int k = j + 1; k < number.length; k++) {
                        int third = number[k];
                        int sum = first + second + third;

                        if (sum == 0)
                            answer++;
                    }
                }
            }
            return answer;
        }
    }
}


