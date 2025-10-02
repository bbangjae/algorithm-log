package programmers.level3;

import java.util.HashMap;
import java.util.Map;

public class [PGS]_숫자_문자열과_영단어 {
    public static void main(String[] args) {

        System.out.println(Solution.solution("one4seveneight"));
    }

    static class Solution {
        public static int solution(String s) {
            StringBuilder answer = new StringBuilder();

            StringBuilder world = new StringBuilder();

            Map<String, Integer> map = new HashMap<>(Map.ofEntries(
                Map.entry("zero", 0),
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3),
                Map.entry("four", 4),
                Map.entry("five", 5),
                Map.entry("six", 6),
                Map.entry("seven", 7),
                Map.entry("eight", 8),
                Map.entry("nine", 9)
            ));

            for (char c : s.toCharArray()) {
                if (map.get(world.toString() + c) != null) {
                    answer.append(map.get(world.toString() + c));
                    world = new StringBuilder();
                    continue;
                }

                if (c < 'a' || c > 'z') {
                    answer.append(c);
                } else {
                    world.append(c);
                }
            }
            return Integer.parseInt(answer.toString());
        }
    }
}
