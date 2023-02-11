package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1920 {
    // 이진 탐색
    public static boolean binarySearch(int arr[], int key) {
        int low = 0;                // 왼쪽 index
        int high = arr.length-1;    // 오른쪽 index

        while(low <= high) {
            int mid = (low+high) / 2; // 중간 index
            
            // 찾고자 하는 값이 중앙값보다 작을 시
            if(key < arr[mid]) {
                high = mid-1;
            }
            // 찾고자 하는 값이 중앙값보다 클 시
            else if(key > arr[mid]) {
                low = mid+1;
            }
            // 찾고자 하는 값을 찾았을 시
            else {
                return true;
            }
        }
        // 찾고자 하는 값이 존재하지 않을 때
        return false;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 배열 입력
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 정렬

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        // 찾고자 하는 값이 존재할 경우 1, 없을 시 0 추가
        for(int i=0;i<m;i++) {
            if(binarySearch(arr, Integer.parseInt(st.nextToken())) == true) {
                sb.append(1).append('\n');
            }
            else
                sb.append(0).append('\n');
        }
        
        System.out.println(sb);
    }
}
