package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p15656 {
    static StringBuilder sb = new StringBuilder();
    static int arr[], temp[];
    static int n, m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        temp = new int[m];

        // 데이터 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        dfs(0);

        System.out.print(sb);
    }

    static void dfs(int depth) {
        if(depth == m) {
            for(int i : temp) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<n;i++) {
            temp[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}
