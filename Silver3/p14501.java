package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14501 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int T[] = new int[n];
        int P[] = new int[n];

        int dp[] = new int[n + 1];  // 최대 금액을 담을 변수

        // 입력
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=0;i<n;i++) {
            // 날짜가 범위를 넘어가지 않는 경우
            if(i + T[i] <= n) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            // 다음 날짜에 현재 날짜의 최대 수당 저장
            dp[i+1] = Math.max(dp[i], dp[i+1]);
        }

        System.out.println(dp[n]);
    }
}
