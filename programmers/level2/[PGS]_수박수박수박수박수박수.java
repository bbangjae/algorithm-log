package programmers.level2;

import java.io.*;

public class [PGS]_수박수박수박수박수박수 {
public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println(Solution.solution(N));
    }

    static class Solution {
        static public String solution(int n) {

            StringBuilder answer = new StringBuilder();

            for(int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    answer.append("수");
                    continue;
                }
                answer.append("박");
            }
            return answer.toString();
        }
    }
}


