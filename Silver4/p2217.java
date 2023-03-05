package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2217 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        
        int max = 0;    // 최대 중량을 담을 변수

        // 입력
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 무게 내림차순 정렬
        Arrays.sort(arr);

        for(int i=0;i<n;i++) {
            int sum = arr[i] * (n-i);    // 중량의 합 = 가장 작은 중량의 무게를 개수만큼 더한 값           

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
