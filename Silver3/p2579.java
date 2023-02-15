package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2579 {
    static Integer dp[];
    static int score[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        score = new int[n+1];
        dp = new Integer[n+1];

        for(int i=1;i<=n;i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = score[1];

        if(n >= 2) dp[2] = score[1] + score[2];    

        System.out.println(function(n));
    }
    
    static int function(int n) {
        if(dp[n] == null) {
            // 마지막 계단을 무조건 밟아야하며, 3계단을 연속해서 밟을 수 없음
            dp[n] = Math.max(function(n-2), function(n-3) + score[n - 1]) + score[n];
        }
        return dp[n];
    }
}
