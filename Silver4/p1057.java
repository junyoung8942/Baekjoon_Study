package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1057 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        st.nextToken();
        int jimin = Integer.parseInt(st.nextToken());   // 진수 번호
        int hansu = Integer.parseInt(st.nextToken());   // 한수 번호

        int cnt = 0;   

        while(true) {
            cnt++;

            // 토너먼트에서 붙게되는 경우 [(1,2), (2,3), ... 순서로 쌍이 됨]
            if((hansu - 1) / 2 == (jimin - 1) / 2) {
                break;
            }   

            // (1,2) = 1, (3,4) = 2, ... 순으로 다음 번호가 정해짐 
            // 수식 = (num - 1) / 2 +1
            jimin = (jimin - 1) / 2 + 1;
            hansu = (hansu - 1) / 2 + 1;
        }

        System.out.println(cnt);
    }
}
