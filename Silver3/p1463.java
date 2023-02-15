package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1463 {
    static Integer dp[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;

        System.out.println(function(n));
    }

    static int function(int n) {
        if(dp[n] == null) {
            // 6으로 나눠지는 경우
            if(n % 6 == 0) {
                dp[n] = Math.min(function(n / 2), function(n / 3)) + 1;
            }
            // 3으로 나눠지는 경우
            else if(n % 3 == 0) {
                dp[n] = Math.min(function(n / 3), function(n - 1)) + 1;
            }
            // 2로 나눠지는 경우
            else if(n % 2 == 0) {
                dp[n] = Math.min(function(n / 2), function(n - 1)) + 1;
            }
            // 2와 3으로 나눠지지 않는 경우
            else {
                dp[n] = function(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
