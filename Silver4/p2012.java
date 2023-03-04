package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2012 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[n];
        long sum = 0;
        
        // 예상 등수 입력
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(arr);

        // 불만도 = (최소값 - 등수)
        for(int i=0;i<arr.length;i++) {
            sum += Math.abs(arr[i] - (i+1));
        }

        System.out.println(sum);
    }
}
