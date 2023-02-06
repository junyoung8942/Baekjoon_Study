package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1676 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        // System.out.println보다 속도가 빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt_2 = 0;  
        int cnt_5 = 0;  

        for(int i=1;i<=input;i++) {
            int num = i;

            while(num%2 == 0) { // 소인수 분해 했을 때 2가 있을 시
                cnt_2++;
                num /= 2;
            }

            while(num%5 == 0) {   // 소인수 분해 했을 때 5가 있을 시
                cnt_5++;
                num /= 5;
            }
        }
        
        bw.write(String.valueOf(Math.min(cnt_2,cnt_5))); // 출력은 String으로 변환해야 함
        bw.close();
    }
}
