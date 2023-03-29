package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1449 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 물이 새는 곳의 개수
        int L = Integer.parseInt(st.nextToken());   // 테이프의 길이
        int cnt = 1;    // 필요한 테이프의 개수, 최소 1개

        int arr[] = new int[n]; // 물이 새는 곳 저장하는 변수

        // 물이 새는 곳 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        double left = arr[0] - 0.5; // 첫 번째 위치의 left 값 저장
        
        for(int i=0;i<n;i++) {
            // (left + 테이프의 길이) 보다 물이 새는곳의 위치가 더 오른쪽에 있는 경우
            if(left + L < arr[i]) {
                cnt++;
                left = arr[i] - 0.5;    // 새로운 테이프를 사용하므로 초기화
            }
        }
        System.out.println(cnt);
    }
}
