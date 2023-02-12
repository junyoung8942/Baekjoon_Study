package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2606 {
    static int node[][];    // 인접 행렬을 사용하여 그래프 표현
    static boolean visited[];   // 정점 탐색여부
    static int n, m;     // 정점, 간선의 개수
    static int count;       // 바이러스에 걸리는 컴퓨터 수

    public static int bfs(int value) {
        Queue<Integer> queue = new LinkedList<>();
        visited[value] = true;  // 방문한 노드 true로 넣어줌
        queue.add(value);   // 큐에 삽입

        // 큐에 아무것도 안들어 있을 때까지, 더 이상 연결된 노드가 없을 시
        while(queue.size() != 0) {
            int temp = queue.remove();  // 큐에서 삭제

            for(int i=0;i<=n;i++) {
                // 큐에서 삭제한 노드와 연결되어 있으며 방문한 노드가 아닐시 큐에 추가
                if(node[temp][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());    // 정점의 개수
        m = Integer.parseInt(br.readLine());    // 간선의 개수

        node = new int[n+1][n+1];   // 인접 행렬
        visited = new boolean[n+1];

        for(int i=0;i<m;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            node[a][b] = node[b][a] = 1;    // 인접 행렬에 연결되어 있다고 값을 넣음
        }

        System.out.println(bfs(1));  // 시작 정점 = 1      
    }
}
