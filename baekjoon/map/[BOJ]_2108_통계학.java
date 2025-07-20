package baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class [BOJ]_2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        TreeSet<Integer> modeSet = new TreeSet<>();

        int sum = 0;
        int maxFrequency = 1;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;

            int numCount = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, numCount);

            if (numCount == maxFrequency) {
                modeSet.add(num);
                continue;
            }

            if (numCount > maxFrequency) {
                modeSet.clear();
                modeSet.add(num);
                maxFrequency = numCount;
            }
        }

        int avg = (int) Math.round((double) sum / N);
        sb.append(avg).append("\n");

        int countSum = 0;
        int mid = (N + 1) / 2;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            countSum += entry.getValue();
            if (countSum >= mid) {
                sb.append(entry.getKey()).append("\n");
                break;
            }
        }

        if (modeSet.size() > 1) {
            modeSet.pollFirst();
            sb.append(modeSet.pollFirst()).append("\n");
        } else {
            sb.append(modeSet.first()).append("\n");
        }

        sb.append(frequencyMap.lastKey() - frequencyMap.firstKey()).append("\n");

        System.out.println(sb);
    }
}
