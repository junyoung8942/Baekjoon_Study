package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2164 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1;i<=N;i++) {
            queue.add(i);
        }

        // 큐에 1개가 남을 때까지 반복
        while(queue.size() != 1) {
            queue.remove();
            queue.add(queue.remove());
        }

        System.out.println(queue.remove());
    }
}
