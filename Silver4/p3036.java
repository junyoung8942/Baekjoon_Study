package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3036 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {    
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=1;i<n;i++) {
            int num = gcd(arr[0], arr[i]);
            System.out.println((arr[0] / num) + "/" + (arr[i] / num));
        }
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
