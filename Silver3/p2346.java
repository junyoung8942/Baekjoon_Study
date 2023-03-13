package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p2346 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<int[]> deque = new ArrayDeque<>();  // 덱 선언, LinkedList시 메모리 초과

        int n = Integer.parseInt(br.readLine());

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            // {index, 내용}
            deque.add(new int[] {(i+1), Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();

        while(deque.size() > 1) {
            int temp[] = deque.remove();
            sb.append(temp[0] + " ");

            // 내용이 양수일 경우
            if(temp[1] > 0) {
                for(int i=1;i<temp[1];i++) {
                    deque.add(deque.remove());
                }
            }

            // 음수일 경우
            else {
                int size = Math.abs(temp[1]);
                for(int i=0;i<size;i++) {
                    deque.addFirst(deque.removeLast());
                }
            }
        }

        sb.append(deque.remove()[0]);
        
        System.out.println(sb);
    }
}
