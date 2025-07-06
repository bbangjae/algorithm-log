package baekjoon;

import java.util.Scanner;

public class [BOJ]_2562_최댓값 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N  = 9;
        int max = 0;
        int maxIndex = 0;

        for (int i = 1; i <= N; i++) {
            int inputNum = sc.nextInt();
            if (inputNum > max) {
                max = inputNum;
                maxIndex = i;
            }
        }
        sc.close();

        System.out.println(max);
        System.out.println(maxIndex);
    }
}