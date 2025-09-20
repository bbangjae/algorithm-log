package programmers.level2;

public class [PGS]_부족한_금액_계산하기 {
    public static void main(String[] args) {

        System.out.println(Solution.solution(3, 20, 4));
    }

    static class Solution {
        static public long solution(int price, int money, int count) {
            long answer = money;

            for (int i = 1; i <= count; i++) {
                int realPrice = price * i;

                answer -= realPrice;
            }

            return answer > 0 ? 0 : Math.abs(answer);
        }
    }
}