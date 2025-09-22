package programmers.level2;

import java.util.Arrays;

public class [PGS]_행렬의_덧셈 {
    public static void main(String[] args) {


        int[][] a = {{1,2},{4,5},{7,8}};
        int[][] b = {{2,3},{5,6},{8,9}};

        System.out.println(Arrays.deepToString(Solution.solution(a, b)));
    }

    static class Solution {
        static public int solution(int[][] arr1, int[][] arr2) {
            int row = arr1.length;
            int column = arr1[0].length;
            int[][] answer = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j] ;
                }
            }
            return answer;
        }
    }
}


