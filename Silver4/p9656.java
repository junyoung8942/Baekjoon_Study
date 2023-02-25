package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 상근이가 먼저 시작
// 마지막 돌을 가져가는 사람이 지게됨
// 항상 완벽하게 게임을 함

// n = 1 -> lose -> false -> CY
// n = 2 -> win -> true -> SK
// n = 3 -> lose -> false -> CY
// n = 4 -> !(dp[3] || dp[1]) -> true -> SK
// n = 5 -> !(dp[4] || dp[2]) -> false -> CY
// n = 6 -> !(dp[5] || dp[3]) -> true -> SK
// n = 7 -> !(dp[6] || dp[4]) -> false -> CY
// n = 8 -> !(dp[7] || dp[5]) -> true -> SK

public class p9656 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        boolean dp[] = new boolean[n+1];
        
        if(n <= 3) {
            if(n % 2 == 0) {
                System.out.println("SK");
                return;
            }
            System.out.println("CY");
            return;
        }

        dp[1] = dp[3] = false;
        dp[2]  = true;

        for(int i=4;i<=n;i++) {
            dp[i] = !(dp[i-1] || dp[i-3]);
        }

        if(dp[n]) {
            System.out.println("SK");
        }
        else {
            System.out.println("CY");
        }

    }
}
