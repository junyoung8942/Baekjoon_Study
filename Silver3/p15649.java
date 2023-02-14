package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15649 {
    static int[] arr;   // 탐색과정에서 값을 담을 변수
    static boolean[] visit; // 유망한 노드인지 검사하기 위해 사용되는 변수

    static void dfs(int N, int M, int depth) {
        // 깊이가 M과 동일해졌을 때 arr에 존재하는 변수 출력
        if(depth == M) {
            for(int val : arr) {
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }

        // 오름차순으로 순서대로 출력
        for(int i=0;i<N;i++) {
            // 방문했던 노드가 아닐 시
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1; // 0부터 시작하므로 i+1을 대입
                dfs(N, M, depth+1); // 1개가 추가되었기 때문에 depth+1
                visit[i] = false;   // 재귀가 끝나면 다시 방문할 수 있게 만들어줌
            }
        }
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];   // M개 만큼 생성
        visit = new boolean[N]; // N개 만큼 생성

        dfs(N, M, 0);
    }
}
