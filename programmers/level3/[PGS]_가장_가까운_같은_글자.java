package programmers.level3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class [PGS]_가장_가까운_같은_글자 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Solution.solution("banana")) );
    }

    static class Solution {
        public static int[] solution(String s) {
            int[] answer = new int[s.length()];
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);

                answer[i] = i - map.getOrDefault(ch, i + 1);
                map.put(ch, i);
            }
            return answer;
        }
    }
}
