package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1735 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A[] = new int[2];   // 분자
        int B[] = new int[2];   // 분모

        for(int i=0;i<2;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        int sum_A = A[0] * B[1] + A[1] * B[0];  // 두 분수의 합의 분자
        int sum_B = B[0] * B[1];    // 두 분수의 합의 분모

        // 최대 공약수
        int gcd_num = gcd(Math.max(sum_A, sum_B), Math.min(sum_A, sum_B));
        
        // 공약수가 존재하지 않을 경우
        if(gcd_num == 1) {
            System.out.print(sum_A + " " + sum_B);
            return;
        }

        // 기약분수 구하기        
        sum_A /= gcd_num;
        sum_B /= gcd_num;

        System.out.print(sum_A + " " + sum_B);

    }

    // 최대 공약수 (a>b)
    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
