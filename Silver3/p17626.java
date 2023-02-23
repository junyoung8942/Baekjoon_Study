package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17626 {
    static int dp[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        System.out.println(function(n));
    }

    static int function(int n) {
        for(int i=2;i<=n;i++) {
            int min = Integer.MAX_VALUE;    // int형의 최대수

            // 점화식
            for(int j=1; j*j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1;
        }

        return dp[n];
    }
}
