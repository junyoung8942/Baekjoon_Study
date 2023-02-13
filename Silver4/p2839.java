package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2839 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int weight = Integer.parseInt(br.readLine());   // 배달해야하는 무게

        // 4와 7은 만들 수 없음
        if(weight == 4 || weight == 7) {
            bw.write(String.valueOf(-1));
        }
        // 5로 나누어 떨어질 경우
        else if(weight % 5 == 0) {
            bw.write(String.valueOf(weight/5));
        }
        // 5로 나눴을 때 나머지가 1이나 3인 경우 (6 -> 3+3, 8 -> 5+3)
        else if(weight % 5 == 1 || weight % 5 == 3) {
            bw.write(String.valueOf(weight/5 + 1));
        }
        // 5로 나눴을 때 나머지가 2나 4인 경우 (12 -> 3+3+3, 14 -> 5+3+3)
        else {
            bw.write(String.valueOf(weight/5 + 2));
        }
        
        bw.close();        
    }
}
