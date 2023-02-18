package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2559 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        int sum = 0;
        int max = 0;
        

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값
        for(int i=0;i<k;i++) {
            max += arr[i];
        }

        // 시작점 i는 (전체길이 - 연속일 + 1) 까지
        for(int i=1;i<arr.length-k+1;i++) {
            sum = 0;
            
            // 종료점 j는 (시작지점 + 연속일) 까지
            for(int j=i;j<i+k;j++) {
                sum += arr[j];
            }
            max = max < sum ? sum : max;
        }

        System.out.println(max);
    }
}
