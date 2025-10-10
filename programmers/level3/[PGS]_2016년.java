package programmers.level3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class [PGS]_2016년 {
    public static void main(String[] args) {

        System.out.println(Solution.solution(5, 24));

    }

    static class Solution {
        public static String solution(int a, int b) {
            StringBuilder answer = new StringBuilder();

            LocalDate date = LocalDate.of(2016, a, b);
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            int dayOfWeekNumber = dayOfWeek.getValue();

            switch (dayOfWeekNumber) {
                case 1:
                    answer.append("MON");
                    break;
                case 2:
                    answer.append("TUE");
                    break;
                case 3:
                    answer.append("WED");
                    break;
                case 4:
                    answer.append("THU");
                    break;
                case 5:
                    answer.append("FRI");
                    break;
                case 6:
                    answer.append("SAT");
                    break;
                case 7:
                    answer.append("SUN");
                    break;
            }
            return answer.toString();
        }
    }
}