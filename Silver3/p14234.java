package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p14234 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 방문한 횟수
        // 우선 순위 큐 생성 (내림차순 정렬)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());  
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());    // 입력
            int a = Integer.parseInt(st.nextToken());

            // a가 0인 경우 아이에게 선물을 줌
            if(a == 0) {
                // 큐가 비어있는 경우 -1
                if(queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                // 큐가 비어있지 않는 경우
                else {
                    sb.append(queue.remove()).append("\n");
                }
            }

            // a가 0이 아닌 경우 큐에 추가
            else {
                for(int j=0;j<a;j++) {
                    queue.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sb);
    }
}
