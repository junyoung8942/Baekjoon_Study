package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1929_2 {

    static boolean prime[];

    // m부터 n까지 소수 찾는 함수, false = 소수
    static void find_prime(int m, int n) {
        prime[0] = prime[1] = true;

        for(int i=2;i<=Math.sqrt(n);i++) {
            if (prime[i]) continue;     // 이미 true이면
            
            // i의 배수는 소수가 아니므로 true로 채워 놓음
            for(int j=i*i;j<=n;j+=i) {
                prime[j] = true;
            }
        }

        // 소수 출력
        for(int i=m;i<=n;i++) {
            if(!prime[i])
                System.out.println(i);
        }
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n+1];

        find_prime(m, n);
    }    
}
