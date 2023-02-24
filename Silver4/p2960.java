package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2960 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean num[] = new boolean[n+1];

        for(int i=2;i<=n;i++) {

            if(num[i] == true) continue;

            // 소수인 경우, 소수의 배수를 크기 순서대로 지움
            for(int j=i; j<=n; j+=i) {

                if(num[j] == true) continue;

                num[j] = true;
                k--;

                if(k == 0) {
                    System.out.println(j);
                    return;
                }
            }
        }

    }
}
