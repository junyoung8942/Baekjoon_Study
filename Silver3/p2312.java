package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2312 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            function(Integer.parseInt(br.readLine()));
        }
    }
    
    static void function(int n) {
            // 인수는 2부터 시작
        for(int i=2;i<=n;i++) {
            int cnt = 0;

            // i로 나눠지지 않을 때까지 반복
            while(n % i == 0) {
                n /= i;
                cnt++;
            }

            // cnt가 존재할 때
            if(cnt != 0) {
                System.out.println(i+" "+cnt);
            }

            // 0이 될때
            if(n == 0) {
                break;
            }
        }
    }
}
