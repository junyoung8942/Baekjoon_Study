package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11659 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());   // 변수 개수
        int m = Integer.parseInt(st.nextToken());   // 연산 횟수

        int arr[] = new int[n+1];
        st = new StringTokenizer(br.readLine());

        // 누적합 저장
        for(int i=1;i<arr.length;i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        // 연산 횟수가 0이 아닐 때까지
        while(m != 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            // i~j 구간 합은 arr[j] - arr[i-1] 이다.
            System.out.println(arr[j] - arr[i-1]);    
            m--;
        }
    }
}
