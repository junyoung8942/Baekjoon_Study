package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1120 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 항상 B가 A보다 길이가 크거나 같음
        String A = st.nextToken();
        String B = st.nextToken();

        int dif = B.length() - A.length();

        int cnt = 0;
        int min = 0;

        // 초기값
        for(int i=0;i<A.length();i++) {
            if(A.charAt(i) != B.charAt(i)) {
                cnt++;
            }
        }
        min = cnt;

        // 두 문자의 길이가 다를 경우
        if(dif > 0) {
            for(int i=1; i <= dif; i++) {
                cnt = 0;
                // A의 길이만큼 문자를 뽑아오기
                for(int j=0; j<A.length() ;j++) {
                    // 문자가 동일하지 않을 때
                    if(A.charAt(j) != B.charAt(i+j)) {
                        cnt++;
                    }
                }
                min = min > cnt ? cnt : min;
            }
        }

        System.out.println(min);
    }   
}
