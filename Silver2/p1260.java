package Silver2;

import java.util.*;
import java.io.*;

public class p1260 {
    static int graph[][];
    static boolean visited[];
    static int vertex;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());  // 정점의 개수
        int edge = Integer.parseInt(st.nextToken());    // 간선의 개수
        int start = Integer.parseInt(st.nextToken());   // 시작할 정점의 번호

        graph = new int[vertex][vertex];
        visited = new boolean[vertex];

        // 간선 입력
        for(int i=0;i<edge;i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2= Integer.parseInt(st.nextToken());
            
            // 양방향 그래프
            graph[node1-1][node2-1] = 1;
            graph[node2-1][node1-1] = 1;
        }

        dfs(start - 1);
        System.out.println();

        Arrays.fill(visited, false);    // visited 리스트 false로 채우기
        bfs(start - 1);
    }

    static void dfs(int start) {
        // 방문표시와 출력
        visited[start] = true;
        System.out.print((start + 1) + " ");

        for(int i=0;i<vertex;i++) {
            // start정점과 간선에 연결되어 있으며 아직 방문하지 않은 정점
            if(!visited[i] && graph[start][i] == 1) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        // 큐 생성과 추가 및 방문 표시
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print((start + 1) + " ");

        // 큐가 비어있지 않을 동안, 더 이상 방문할 정점이 없을 시
        while(!queue.isEmpty()) {
            int temp = queue.remove();

            for(int i=0;i<vertex;i++) {
                // 아직 방문하지 않은 정점이며 temp와 연결되어 있는 정점인 경우
                if(graph[temp][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print((i+1) + " ");
                }
            }
        }


    }
    
}
