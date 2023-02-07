package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine()); // 1~1000
        int cnt = 0;

        // 등차수열 a_n = a1 + (n-1)d
        // 1~99는 모두 등차수열임
        // 따라서 100보다 큰 수의 등차수열을 구하면 해결
        
        if(num < 100) {
            cnt = num;
        }
        else {
            cnt = 99;  
            for(int i=100;i<=num;i++) {
                int num_100 = i / 100; // 백의 자리
                int num_10 = (i / 10) % 10;  // 십의 자리
                int num_1 = i % 10;   // 일의 자리

                if((num_100-num_10) == (num_10-num_1)) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
