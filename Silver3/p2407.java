package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p2407 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger a = factorial(n);
        BigInteger b = factorial(m).multiply(factorial(n-m));

        System.out.println(a.divide(b));
    }

    static BigInteger factorial(int n) {
        if(n <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
