package programmers.level2;

public class [PGS]_문자열_다루기_기본 {
    public static void main(String[] args) {

        System.out.println(Solution.solution("1234"));
    }

    static class Solution {
        static public boolean solution(String s) {
            boolean answer = true;


            int length = s.length();

            if (length != 4 && length != 6) {
                answer = false;
                return answer;
            }

            for (int i = 0; i < length; i++) {
                if (((int) s.charAt(i)) > 57) {
                    answer = false;
                    return answer;
                }
            }
            return answer;
        }
    }
}


