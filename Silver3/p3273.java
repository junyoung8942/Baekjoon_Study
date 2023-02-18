package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p3273 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sum;
        int cnt = 0;

        // 데이터 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sum = Integer.parseInt(br.readLine());

        Arrays.sort(arr);   // 오름차순 정렬
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == sum) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
