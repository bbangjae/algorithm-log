package programmers.level3;

import java.util.HashMap;
import java.util.Map;

public class [PGS]_숫자_짝꿍 {
    public static void main(String[] args) {

        System.out.println(Solution.solution("100", "123450"));
    }

    static class Solution {
        public static String solution(String X, String Y) {

            StringBuilder answer = new StringBuilder();

            Map<Integer, Integer> xMap = new HashMap<Integer, Integer>();
            Map<Integer, Integer> yMap = new HashMap<Integer, Integer>();

            for (char x : X.toCharArray()) {
                int num = Character.getNumericValue(x);
                xMap.put(num, xMap.getOrDefault(num, 0) + 1);
            }

            for (char y : Y.toCharArray()) {
                int num = Character.getNumericValue(y);
                yMap.put(num, yMap.getOrDefault(num, 0) + 1);
            }

            for (int i : xMap.keySet()) {
                if (!yMap.containsKey(i)) {
                    continue;
                }

                if (xMap.get(i) > yMap.get(i)) {
                    answer.append(String.valueOf(i).repeat(yMap.get(i)));
                    continue;
                }
                answer.append(String.valueOf(i).repeat(xMap.get(i)));
            }

            if (answer.toString().isEmpty()) {
                return "-1";
            }

            if (answer.reverse().toString().startsWith("0")) {
                return "0";
            }

            return answer.toString();
        }
    }
}
