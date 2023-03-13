package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2581 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        // 1은 소수가 아님
        if(m == 1) {
            m++;
        }

        // m ~ n까지
        for(int i=m;i<=n;i++) {
            boolean check = false;  // 소수가 아닐 시 true

            // 소수 찾기
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i % j == 0) {
                    check = true;
                    break;
                }
            }

            // 소수이면서 min값이 0이 아닐 때
            if(check == false && min != 0) {
                sum += i;
            }
            // 소수이면서 min값이 0일 때
            else if(check == false && min == 0) {
                sum += i;
                min = i;
            }
        }

        // 소수가 존재하지 않을 시
        if(min == 0) {
            bw.write("-1");
        }
        else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(min));
        }

        bw.close();
    }
}
