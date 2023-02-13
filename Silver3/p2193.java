package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2193 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int fib[] = new int[N + 1];

        fib[0] = 0;
        fib[1] = 1;

        for(int i=2;i<=N;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println(fib[N]);
    }
}
