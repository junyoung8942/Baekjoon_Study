package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11727 {
    static Integer dp[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];
        dp[0] = 0;
        dp[1] = 1;
        if(n>=2)    dp[2] = 3;

        System.out.println(function(n));
    }

    static int function(int n) {
        if(dp[n] == null) {
            dp[n] = (function(n-1) + 2 * function(n-2)) % 10007;
        }
        return dp[n];
    }
}
