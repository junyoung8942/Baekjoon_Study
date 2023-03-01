package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11866 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();  // 큐 생성

        // 큐에 데이터 추가
        for(int i=1;i<=n;i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        // 큐가 비어있을 때까지
        while(!queue.isEmpty()) {
            // k번째를 제거하기 위해 값을 미룸
            for(int i=1;i<k;i++) {
                queue.add(queue.remove());
            }

            if(queue.size() == 1) {
                sb.append(queue.remove());
            }
            else {
                sb.append(queue.remove()+", ");
            }
        }
        sb.append('>');

        System.out.println(sb);

    }
}
