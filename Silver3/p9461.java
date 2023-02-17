package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9461 {
    static long dp[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        dp = new long[101];

        dp[1] = dp[2] = dp[3] = 1;

        for(int i=4;i<101;i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }

        for(int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }
    }
}
