package programmers.level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class [PGS]_두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(Solution.solution(array)));
    }

    static class Solution {
        public static int[] solution(int[] numbers) {
            Set<Integer> sum = new HashSet<>();

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sum.add(numbers[i] + numbers[j]);
                }
            }

            return sum.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
        }
    }
}
