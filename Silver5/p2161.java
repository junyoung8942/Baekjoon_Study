package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2161 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        // 1 ~ n 큐에 저장
        for(int i=1;i<=n;i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while(queue.size() > 1) {
            sb.append(queue.remove()).append(" ");

            queue.add(queue.remove());
        }

        sb.append(queue.remove()).append(" ");

        System.out.println(sb);
    }

}
