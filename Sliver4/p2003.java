package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2003 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int value[] = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end  = 0, sum = 0, cnt = 0;
        while(start < n) {
            // 합이 목표값보다 크거나 index가 마지막일 때
            if(sum > m || end == n)
                sum -= value[start++];
            // 목표값에 더해주기 
            else
                sum += value[end++];
            
            // 합이 목표값과 같아질 때
            if(sum==m) cnt++;
        }
        System.out.println(cnt);
    }
}
