package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class [BOJ]_2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] freq = new int[8001];
        int min = 4000;
        int max = -4000;
        int sum = 0;
        int maxFreq = -1;

        List<Integer> modeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int currentFreq = ++freq[num + 4000];

            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);

            if (currentFreq == maxFreq) {
                modeList.add(num);
            }
            if (currentFreq > maxFreq) {
                modeList.clear();
                modeList.add(num);
                maxFreq = currentFreq;
            }
        }

        int avg = (int) Math.round((double) sum / N);
        sb.append(avg).append("\n");

        int mid = (N + 1) / 2;
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            count += freq[i];
            if (count >= mid) {
                sb.append(i - 4000).append("\n");
                break;
            }
        }

        modeList.sort(null);
        if (modeList.size() > 1) {
            sb.append(modeList.get(1)).append("\n");
        } else {
            sb.append(modeList.get(0)).append("\n");
        }

        sb.append(max - min).append("\n");

        System.out.println(sb);
    }
}
