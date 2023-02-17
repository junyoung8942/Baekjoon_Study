package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1904 {
    static int dp[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];        

        if(n <= 2){
            System.out.println(n);
        }
        else {
            dp[1] = 1;
            dp[2] = 2;
            function(n);
            System.out.println(dp[n]);
        }

    }

    static void function(int n) {
        for(int i=3;i<=n;i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 15746;
        }
    }
}
