package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1789 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num = Long.parseLong(br.readLine());
        
        long sum = 0;
        int cnt = 0;
        int i=1;

        // 1+2+3+...
        while(true) {   
            if(sum > num)   // 총합이 num보다 커질 때
                break;
            sum += i++;
            cnt++;
        }

        bw.write(String.valueOf(cnt-1));    // 같아질 때와 값이 넘어갔을 때를 생각하여 -1
        bw.close();
    }
}
