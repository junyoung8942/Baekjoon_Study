package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15650 {
    static int arr[];
    static int N, M;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
    }

    static void dfs(int start, int depth) {
        if(M == depth) {
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start;i<=N;i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}
