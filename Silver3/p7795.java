package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p7795 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스
        StringBuilder sb = new StringBuilder();

        for(int k=0;k<T;k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int A[] = new int[n];    // 배열1 생성
            int B[] = new int[m];    // 배열2 생성
            int cnt = 0;

            // A, B 데이터 입력
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            // 배열 정렬
            Arrays.sort(A);
            Arrays.sort(B);

            // A의 값이 B의 값보다 큰 경우의 수 찾기
            for(int i=0;i<n;i++) {
                // A의 값이 B의 최솟값보다 작거나 같은 경우
                if(A[i] <= B[0]) {
                    continue;
                }

                cnt += binary_search(A[i], B);
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    // 이진탐색
    static int binary_search(int num, int B[]) {
        int left = 0;
        int right = B.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(num > B[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left;
    }
}
