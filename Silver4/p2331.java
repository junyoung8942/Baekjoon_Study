package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p2331 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(A);        

        String str = String.valueOf(A);
        while(true) { 
            int value = 0;  // 새로운 값

            // 각 자리수의 숫자를 P번 곱합 수들의 합
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);
                value += (int)Math.pow((c - '0'), P);
            }
            
            // 존재하지 않는 값이면 추가
            if(!arr.contains(value)) {
                arr.add(value);
                str = String.valueOf(value);   // 다음 값을 구하기 위해 값 변경
            }
            // 존재하는 값이면 중복되는 값의 전까지의 개수를 출력하고 반복문 종료
            else {
                int cnt = 0;
                for(int i : arr) {
                    if(i == value) {    
                        break;
                    }
                    cnt++;
                }
                System.out.println(cnt);
                break;
            }
        }

        
    }
}
