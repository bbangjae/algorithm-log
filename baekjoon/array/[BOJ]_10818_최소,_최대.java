package baekjoon;

import java.util.Scanner;

public class [BOJ]_10818_최소,_최대 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int min = 1_000_000;
        int max = -1_000_000;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        sc.close();
        System.out.println(min + " " + max);
    }
}