package Silver5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class p1429 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int count = 0;

        for(int i=1;i<input.length();i++) {
            if(input.charAt(i-1) != input.charAt(i)) {  // 숫자가 변경되었을 때
                count++;
            }
        }

        if(count%2==0)  // 짝수번 바뀌었을 때
            count /= 2;
        else            // 홀수번 바뀌었을 때
            count = count / 2 + 1;
        
        System.out.println(count);
    }
}
