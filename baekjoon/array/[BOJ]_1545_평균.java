package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class [BOJ]_1545_평균 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int max = 0;
        double sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int inputNum = sc.nextInt();
            list.add(inputNum);
            if (inputNum > max) {
                max = inputNum;
            }
        }
        sc.close();

        for (Integer listElement : list) {
            sum += (double) listElement / max  * 100;
        }
        System.out.println(sum / N);
    }
}
