package Silver5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14916 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 거스름돈 액수

        int cnt = 0;    // 동전의 개수

        // 거르름돈은 2원 or 5원만 존재
        while(true) {
            // 5원을 뺀 값이 2 또는 5의 배수인 경우
            if(n > 5 && (n - 5) % 2 == 0 ||  (n - 5) % 5 == 0) {
                n -= 5;
                cnt++;
            }
            // 2원을 뺀 값이 2 또는 5의 배수인 경우
            else if(n > 2 && (n - 2) % 2 == 0 || (n - 2) % 5 == 0) {
                n -= 2;
                cnt++;
            }
            // 거스름돈을 줄 수 없는 경우
            else {
                System.out.println("-1");
                return; 
            }
            // 더 이상 거스름돈을 안줘도 되는 경우
            if(n == 0) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
