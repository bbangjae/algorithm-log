package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class [BOJ]_3052_나머지 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N  = 10;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt() % 42);
        }
        sc.close();

        for (Integer integer : list) {
            if (!countList.contains(integer)) {
                countList.add(integer);
            }
        }
        System.out.println(countList.size());
    }
}