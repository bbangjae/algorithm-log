package programmers.level3;

public class [PGS]_옹알이_(2) {
    public static void main(String[] args) {

        String[] babbling = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };

        System.out.println("Solution.solution(babbling) = " + Solution.solution(babbling));

    }

    static class Solution {
        public static int solution(String[] babbling) {
            int answer = 0;


            for (String string : babbling) {
                int index = 0;
                String prev = "";
                boolean valid = true;

                while (index < string.length()) {
                    boolean match = false;

                    if (index + 3 <= string.length() && !prev.equals("aya")) {
                        String world = string.substring(index, index + 3);
                        if (world.equals("aya")) {
                            index += 3;
                            prev = "aya";
                            continue;
                        }
                    }

                    if (index + 2 <= string.length() && !prev.equals("ye")) {
                        String world = string.substring(index, index + 2);
                        if (world.equals("ye")) {
                            index += 2;
                            prev = "ye";
                            continue;
                        }
                    }

                    if (index + 3 <= string.length() && !prev.equals("woo")) {
                        String world = string.substring(index, index + 3);
                        if (world.equals("woo")) {
                            index += 3;
                            prev = "woo";
                            continue;
                        }
                    }

                    if (index + 2 <= string.length() && !prev.equals("ma")) {
                        String world = string.substring(index, index + 2);
                        if (world.equals("ma")) {
                            index += 2;
                            prev = "ma";
                            continue;
                        }
                    }

                    if (!match) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    answer++;
                }

            }
            return answer;
        }
    }
}
