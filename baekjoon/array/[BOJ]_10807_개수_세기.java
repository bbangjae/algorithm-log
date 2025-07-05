package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10807_개수_세기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int findNum = sc.nextInt();
        sc.close();

        int sum = 0;
        for (Integer listElement : list) {
            if (listElement == findNum) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

