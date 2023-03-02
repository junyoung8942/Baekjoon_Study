package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2740 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // A행렬의 크기 입력 (n*m)
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int A[][] = new int[n][m];

        // A행렬 입력
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // B행렬의 크기 입력 (m*k)
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());

        int B[][] = new int[m][k];

        // B행렬 입력
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<k;j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬의 곱을 담을 변수
        int C[][] = new int[n][k];

        // 행렬의 곱 연산
        for(int i=0;i<n;i++) {  // A행렬의 i번째 row
            for(int j=0;j<k;j++) {  // B행렬의 j번째 col

                for(int z=0;z<m;z++) {
                    C[i][j] += A[i][z] * B[z][j];
                }
            }
        }

        // 행렬 곱 출력
        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
