package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class p2751_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();    // 힙 자료구조

        // 입력
        for(int i=0;i<n;i++) {
            heap.add(Integer.parseInt(br.readLine()));
        }

        // 루트노트 삭제
        for(int i=0;i<n;i++) {
            bw.write(String.valueOf(heap.remove()) + "\n");
        }

        bw.close();
    }
}
