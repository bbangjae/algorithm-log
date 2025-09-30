package programmers.level3;

public class [PGS]_시저_암호 {
    public static void main(String[] args) {
        String a = "ABC Z";
        System.out.println(Solution.solution(a, 3));
    }

    static class Solution {
        public static String solution(String s, int n) {

            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    sb.append(c);
                    continue;
                }

                if ((int) c >= 65 && (int) c <= 90) {
                    if ((int) c + n > 90) {
                        sb.append((char) (c + n - 26));
                    } else {
                        sb.append((char) (c + n));
                    }
                    continue;
                }

                if ((int) c + n > 122) {
                    sb.append((char) (c + n - 26));
                } else {
                    sb.append((char) (c + n));
                }
            }
            return sb.toString();
        }
    }
}
