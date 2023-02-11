package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1158 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        // 큐에 1~n까지 추가
        for(int i=1;i<=n;i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(queue.size() != 1) {
            // k번째 전에 있던 값들을 맨 뒤로 보냄
            for(int i=0;i<k-1;i++) {
                queue.offer(queue.remove());
            }

            // 스트링버퍼에 k번째 값을 추가
            sb.append(queue.remove() + ", ");
        }

        // 큐에 남아있는 마지막 value추가
        sb.append(queue.remove() + ">");

        System.out.println(sb);
    }
}
