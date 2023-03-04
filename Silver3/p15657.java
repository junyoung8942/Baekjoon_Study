package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p15657 {
    static int arr[], printarr[];
    static int n, m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   // n개
        m = Integer.parseInt(st.nextToken());   // 출력될 숫자

        arr = new int[n];
        printarr = new int[m];

        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr);

        dfs(0, 0);
    }

    static void dfs(int start, int depth) {
        if(depth == m) {
            for(int i : printarr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start;i<n;i++) {
            printarr[depth] = arr[i];
            dfs(i, depth+1);
        }
    }
}
