package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1748 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0; // 총 자릿수

        for(int i=1;i<=n;i++) {
            cnt++;  // 최소 한자리 이상 차지

            int temp = i;
            // i번째 자릿수 구하기, 1 -> 1, 10 -> 2, 55 -> 2, 664 -> 3
            while(temp / 10 > 0) {
                temp /= 10;
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();

    }
}
