package programmers.level2;

public class [PGS]_문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {

        String s = "Zbcdefg";

        System.out.println(Solution.solution(s));
    }

    static class Solution {
        static public String solution(String s) {
            StringBuilder answer = new StringBuilder();
            int size = s.length();

            for (int i = 0; i < size; i++) {
                char c = s.charAt(i);

                if (answer.isEmpty()) {
                    answer.append(c);
                    continue;
                }

                boolean inserted = false;

                for(int j = 0; j < answer.length(); j++) {

                    if (answer.charAt(j) < c) {
                        String prefix = answer.substring(0, j);
                        String suffix = answer.substring(j);

                        answer = new StringBuilder(prefix + c + suffix);
                        inserted = true;
                        break;
                    }
                }
                if (!inserted) {
                    answer.append(c);
                }
            }
            return answer.toString();
        }
    }
}


