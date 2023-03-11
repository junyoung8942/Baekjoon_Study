package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p9372 {
    static int graph[][];
    static boolean visited[];
    static int cnt;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        for(int k=0;k<T;k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());    // 국가의 수, 노드의 수
            int m = Integer.parseInt(st.nextToken());    // 비행기 종류, 간선의 수

            graph = new int[n+1][n+1];
            visited = new boolean[n+1];
            cnt = 0;

            // 그래프 간선 입력
            for(int i=0;i<m;i++) {
                st = new StringTokenizer(br.readLine());
                init(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            // bfs
            bfs(n);

            System.out.println(cnt - 1);
        }
    }

    // 양방향 그래프
    static void init(int a, int b) {
        graph[a][b] = graph[b][a] = 1;
    }

    // bfs
    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()) {
            cnt++;
            int value = queue.remove();
            for(int i=1;i<=n;i++) {
                if(graph[value][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    

}
