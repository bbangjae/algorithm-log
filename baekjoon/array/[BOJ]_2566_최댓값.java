package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class [BOJ]_2566_최댓값 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N  = 81;
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < N; i++) {
            int inputNum = sc.nextInt();
            if (max < inputNum) {
                max = inputNum;
                maxIndex = i;
            }
        }
        sc.close();

        int row = maxIndex / 9 + 1;
        int col = maxIndex % 9 + 1;

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
