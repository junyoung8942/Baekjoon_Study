package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9996 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String pattern = br.readLine(); // 패턴 입력
        String str[] = pattern.split("\\*");    // *은 특수 문자이기 때문에 \\를 표기해줘야 함

        int pattern_size = str[0].length() + str[1].length(); // 패턴의 시작과 끝의 문자의 길이 합

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            
            // 시작과 끝이 해당 패턴과 동일하며 크기가 크거나 동일할 경우
            if(temp.startsWith(str[0]) && temp.endsWith(str[1]) && pattern_size <= temp.length()) {
                sb.append("DA");
            }
            // 패턴과 동일하지 않을 시
            else {
                sb.append("NE");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
