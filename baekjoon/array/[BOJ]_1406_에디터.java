package baekjoon;

import java.io.*;
import java.util.LinkedList;

public class [BOJ]_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();

        String item = br.readLine();
        int N =  Integer.parseInt(br.readLine());
        int cursor = item.length();

        for (int i = 0; i < item.length(); i++) {
            list.add(item.charAt(i));
        }

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.charAt(0) == 'L') {
                if (cursor != 0) {
                    cursor--;
                }
            }

            if (line.charAt(0) == 'D') {
                if (cursor != list.size()) {
                    cursor++;
                }
            }

            if (line.charAt(0) == 'B') {
                if (!list.isEmpty() && cursor != 0) {
                    list.remove(cursor - 1);
                    cursor--;
                }
            }

            if (line.charAt(0) == 'P') {
                list.add(cursor,  line.charAt(2));
                cursor++;
            }
        }

        for (Character character : list) {
            sb.append(character);
        }
        System.out.println(sb);
    }
}
