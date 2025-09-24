package programmers.level2;

import java.util.Arrays;

public class [PGS]_최대공약수와_최소공배수 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, 12)));
    }

    static class Solution {
        public static int[] solution(int n, int m) {
            int[] answer = new int[2];

            int gcd = gcd(n, m);

            answer[0] = gcd;
            answer[1] = (n * m) / gcd;

            return answer;
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}


