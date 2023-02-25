package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9613 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int n = Integer.parseInt(st.nextToken());
            int test[] = new int[n];            
            long sum = 0;

            for(int j=0;j<n;j++) {
                test[j] = Integer.parseInt(st.nextToken());
            }

            // 가능한 모든 쌍의 GCD의 합
            for(int j=0;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    sum += gcd(test[j], test[k]);
                }
            }

            System.out.println(sum);
        }
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
