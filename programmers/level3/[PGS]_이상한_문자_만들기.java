package programmers.level3;

public class [PGS]_이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("try hello world"));
    }

    static class Solution {
        public static String solution(String s) {
            StringBuilder answer = new StringBuilder();
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if((int) ch == 32) {
                    index = 0;
                    answer.append(ch);
                    continue;
                }

                if (index % 2 == 1) {
                    answer.append(Character.toLowerCase(ch));
                } else {
                    answer.append(Character.toUpperCase(ch));
                }
                index++;
            }
            return answer.toString();
        }
    }
}


