package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11047 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int money[] = new int[N];   // 동전의 가치
        int cnt = 0;    // 동전의 개수

        for(int i=0;i<N;i++) {
            money[i] = Integer.parseInt(br.readLine());
        }
        
        // 가장 큰 가치의 동전부터 차례로 계산
        for(int i=N-1;i>=0;i--) {
            cnt += K / money[i];    
            K %= money[i];
        }

        System.out.println(cnt);
    }
}
