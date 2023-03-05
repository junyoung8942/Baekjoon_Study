package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2776 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        for(int k=0;k<T;k++) {
            int n = Integer.parseInt(br.readLine());
            
            int arr[] = new int[n];
            
            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 정렬
            Arrays.sort(arr);

            int m = Integer.parseInt(br.readLine());

            // 이진탐색
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++) {
                bw.write(String.valueOf(search(arr, Integer.parseInt(st.nextToken()))) + "\n");
            }
        }

        bw.close();
    }   

    // 이진탐색
    static int search(int arr[], int val) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(arr[mid] > val) {
                right = mid - 1;
            }
            else if(arr[mid] < val) {
                left = mid + 1;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
