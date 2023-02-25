package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1788 {
    static int dp[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        // n이 0,-1,1 일 때
        if(n == 0) {
            System.out.println("0");
            System.out.println(n);
            return;
        }
        else if(Math.abs(n) == 1) {
            System.out.println("1");
            System.out.println(Math.abs(n));
            return;
        }

        // n이 양수일 때
        else if(n > 0) {    
            dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;

            for(int i=2;i<=n;i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000000;
            }
        }

        // n이 음수일 때
        else {
            n = Math.abs(n);    // index는 양수
            dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;

            for(int i=2;i<=n;i++) {
                dp[i] = (dp[i-2] - dp[i-1]) % 1000000000;
            }
        }

        
        if(dp[n] > 0) {
            System.out.println("1");
            System.out.println(dp[n]);
        }
        else if(dp[n] < 0) {
            System.out.println("-1");
            System.out.println(Math.abs(dp[n]));
        }
        else {
            System.out.println("0");
            System.out.println("0");
        }

    }
}
