package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10816 {  
    static int arr[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        // 데이터 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 이진탐색을 위해 정렬
       
        int m = Integer.parseInt(br.readLine());
        int result[] = new int[m];

        // 해당하는 숫자가 몇개 존재하는 가
        // (max_index - min_index)
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            int value = Integer.parseInt(st.nextToken());
            result[i] = find_max_index(value) - find_min_index(value);
        }

        // 출력
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    // 이진탐색, 동일한 값 존재 시 최대 index찾기
    static int find_max_index(int value) {
        int left = 0;
        int right = arr.length;

        while(left < right) {
            int mid = (left + right) / 2;

            if(arr[mid] > value) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }

    // 이진탐색, 동일한 값 존재 시 최소 index찾기
    static int find_min_index(int value) {
        int left = 0;
        int right = arr.length;

        while(left < right) {
            int mid = (left + right) / 2;

            if(arr[mid] >= value) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}
