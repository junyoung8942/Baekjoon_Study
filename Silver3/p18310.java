package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p18310 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1개만 존재할 경우
        if(n == 1) {
            System.out.println(arr[0]);
            return;
        }

        // 정렬
        Arrays.sort(arr);
        
        // 최소 거리가 되는 안테나의 index값 저장, 초기값 = 중앙값
        int index = (arr.length - 1) / 2; 

        int min = Integer.MAX_VALUE;

        // 안테나를 중앙값과 (중앙값 + 1)에 설치할 경우 비교하여 최소값에 저장
        for(int k=0;k<2;k++) {
            int temp = 0;

            // 거리 계산
            for(int i=0;i<n;i++) {
                // 거리이므로 절댓값을 씌워줌
                temp += Math.abs(arr[i] - arr[index + k]);
            }

            // min에 초깃값 넣어주기
            if(k == 0) {
                min = temp;
            }
            
            // 값을 비교하여 더 작은 경우 index = index + 1
            else if(k == 1 && min > temp) {
                index++;
            }
        }

        System.out.println(arr[index]);
    }
}   
