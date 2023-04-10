package Silver2;

import java.io.*;
import java.util.*;

public class p2805 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 나무의 개수
        int m = Integer.parseInt(st.nextToken());   // 필요한 나무의 길이
        
        Integer arr[] = new Integer[n];

        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        int max = arr[0];       // 가장 큰 나무의 길이
        int min = 0;

        // 이진 탐색
        while(min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            
            // 길이 계산
            for(int i : arr) {
                if(i - mid > 0) {
                    sum += i - mid;
                }
            }

            // 자른 나무의 길이가 필요한 나무의 길이보다 작은 경우, 절단기의 길이가 줄어들어야 됨
            if(sum < m) {
                max = mid;
            }

            // 자른 나무의 길이가 필요한 나무의 길이보다 큰 경우, 절단기의 길이가 늘어나야 됨
            else {
                min = mid + 1;
            }
        }
        
        System.out.println(min - 1);
    }
}
