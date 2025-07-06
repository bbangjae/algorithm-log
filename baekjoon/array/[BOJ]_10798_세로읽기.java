package baekjoon;

import java.util.Scanner;

public class [BOJ]_10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        br.close();

        for (int i = 0; i < 15 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                if (arr[j][i] != '\0') {
                    bw.write(arr[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
