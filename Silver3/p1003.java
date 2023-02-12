package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1003 {
    // 피보나치 수열
    // 0이 호출되는 수 | 1이 호출되는 수
    // 0 -> 1 0
    // 1 -> 0 1
    // 2 -> 1 1
    // 3 -> 2+1 -> 1 2
    // 4 -> 3+2 -> 2 3

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt_0[] = new int[41];
        int cnt_1[] = new int[41];

        //초기화
        cnt_0[0] = cnt_1[1] = 1;
        cnt_0[1] = cnt_1[0] = 0;
        
        // 0과 1이 호출되는 수 배열에 저장하기
        for(int i=2;i<41;i++) {
            cnt_0[i] = cnt_0[i-1] + cnt_0[i-2];
            cnt_1[i] = cnt_1[i-1] + cnt_1[i-2];
        }

        // 출력
        for(int i=0;i<n;i++) {
            int index = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(cnt_0[index]) + " " + String.valueOf(cnt_1[index]));
            bw.newLine();
        }

        bw.close();
    }
}
