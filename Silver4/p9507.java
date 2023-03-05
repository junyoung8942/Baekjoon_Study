package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9507 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스
        long dp[] = new long[68];   // 범위 : 0 ~ 67

        dp[0] = dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4;i<dp.length;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }
        

        // 출력
        for(int k=0;k<t;k++) {
            int index = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[index]) + "\n");
        }

        bw.close();
    }
}
