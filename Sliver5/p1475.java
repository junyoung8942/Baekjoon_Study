package Silver5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class p1475 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int number[] = new int[10];
        int cnt = 1;

        for(int i=0;i<number.length;i++) {  // 초기화, 6과 9를 한번에 묶음
            if(i==6 || i==9) {
                number[i] = 2;
            }
            else number[i] = 1;
        }

        for(int i=0;i<input.length();i++) {
            int c = input.charAt(i)-'0';
            
            if(number[c] > 0) { // 숫자가 존재할 시
                if(c == 6 || c == 9) {  // 6 또는 9일 때
                    number[6]--;
                    number[9]--;
                }
                else {
                    number[c]--;
                }
                continue;
            }

            // 숫자가 존재하지 않을 시, 숫자 세트 +1개
            for(int j=0;j<number.length;j++) {
                if(j==6 || j==9){   // 6과 9는 한번에 묶어서 사용
                    number[j] += 2;
                }
                else
                    number[j]++;
            }
            cnt++;

            // 해당 숫자에 대응하는 number -1
            if(c == 6 || c == 9) {  // 6 또는 9일 때
                number[6]--;
                number[9]--;
            }
            else {
                number[c]--;
            }
        }

        System.out.println(cnt);
    }    
}
