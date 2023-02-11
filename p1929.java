package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1929 {
    static boolean find_prime(int value) {
        boolean b = true;
        // 2 ~ value/2 까지 나눴을 때 0으로 나눠떨어지면 소수가 아님
        for(int i=2;i<=value/2;i++) {
            if(value % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // m ~ n까지 소수 찾기
        for(int i=m;i<=n;i++) {
            if(find_prime(i)) {
                System.out.println(i);
            }
        }
    }
}
