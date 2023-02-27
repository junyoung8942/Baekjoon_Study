package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1193 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;    // 몇 번째인지
        int temp = 1;   // 순서를 확인하기 위해 변수 사용, +1, +2, +3, ...이 규칙적으로 더해짐

        for(int i=1;i<=n;i++) {
            temp += i;
            if(n >= temp) {
                cnt++;
            }
            else {
                temp -= i;
                break;
            }   
        }

        int a;  // 분자
        int b;  // 분모

        // 짝수일 때
        if(cnt % 2 == 0) {
            a = n - temp + 1;   // 분자
            b = cnt - (n - temp);   // 분모   
        }
        // 홀수일 때
        else {
            a = cnt - (n - temp);   // 분자
            b = n - temp + 1;   // 분모
        }

        System.out.println(a + "/" + b);

    }
}
