package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1476 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    // 입력
        
        int earth = Integer.parseInt(st.nextToken()); 
        int sun = Integer.parseInt(st.nextToken());
        int moon = Integer.parseInt(st.nextToken());

        int E = 1;  // 1~15
        int S = 1;  // 1~28
        int M = 1;  // 1~19

        int year = 1;
        
        while(true) {
            if(earth == E && sun == S && moon == M) break; // 입력과 같아지면 종료

            year++;
            E++;
            S++;
            M++;

            // 허용되는 범위보다 커질 시 다시 1로 만들기
            if(E > 15) {
                E = 1;
            }
            if(S > 28) {
                S = 1;
            }
            if(M > 19) {
                M = 1;
            }
        }

        System.out.println(year);

    }
}
