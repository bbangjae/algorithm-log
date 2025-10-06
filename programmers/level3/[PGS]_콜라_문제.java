package programmers.level3;

public class [PGS]_콜라_문제 {
    public static void main(String[] args) {

    System.out.println(Solution.solution(2, 1, 20));
}

static class Solution {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n / a != 0) {
            int currentBottles = n;
            answer += (n / a) * b;

            n = (n / a) * b;
            n += currentBottles % a;
        }
        return answer;
        }
    }
}
