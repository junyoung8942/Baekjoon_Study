package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11441 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n+1];   // 누적합

        // 누적합 구하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }

        int m = Integer.parseInt(br.readLine());    // 테스트 횟수
        StringBuilder sb = new StringBuilder();

        for(int k=0;k<m;k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // i~j번째까지의 합 = (j번째의 누적합) - (i-1번째의 누적합)
            if(k != m-1) {
                sb.append(arr[j] - arr[i-1]).append("\n");
            }
            else {
                sb.append(arr[j] - arr[i-1]);
            }
        }

        System.out.println(sb);
    }
}
