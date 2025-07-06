package baekjoon;

import java.util.Scanner;

public class [BOJ]_10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int[][] arr = new int[5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
            if (line.length() != 15) {
                arr[i][line.length()] = -1;
            }
        }
        br.close();

        for (int i = 0; i < 15 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                if (arr[j][i] == -1) {
                    if (i == 14)
                        continue;
                    arr[j][i + 1] = -1;
                    continue;
                }
                bw.write(arr[j][i]);
            }
        }
        bw.flush();
        bw.close();
    }
}
