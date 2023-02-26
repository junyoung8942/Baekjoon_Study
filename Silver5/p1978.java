package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            if(find_prime(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // 소수 찾는 메소드, true = 소수
    static boolean find_prime(int val) {

        if(val == 1) return false;

        for(int i=2;i<=Math.sqrt(val);i++) {
            if(val % i == 0) {
                return false;
            }
         }

         return true;
    }
}
