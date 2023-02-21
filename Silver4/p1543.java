package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1543 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String word = br.readLine();

        int cnt = 0;

        for(int i=0;i<str.length();i++) {
            String temp = "";

            // 단어 길이만큼 뽑기
            for(int j=0;j<word.length();j++) {
                if(i+j >= str.length()) {
                    break;
                }
                char c = str.charAt(i+j);
                temp += c;
            }

            // 동일할 경우
            if(word.equals(temp))  {
                cnt++;
                i += word.length() - 1;
            }

        }

        System.out.println(cnt);
    }
}
