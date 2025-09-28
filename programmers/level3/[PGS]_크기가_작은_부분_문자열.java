package programmers.level3;

public class [PGS]_크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("10203", "15"));
    }

    static class Solution {
        public static int solution(String t, String p) {
            int answer = 0;

            for (int i = 0; i <= t.length() - p.length(); i ++) {
                long num = Long.parseLong(t.substring(i, i + p.length()));
                if (num <= Long.parseLong(p)) {
                    answer++;
                }
            }
            return answer;
        }
    }
}