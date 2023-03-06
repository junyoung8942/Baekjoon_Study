package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p11656 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String part_str[] = new String[str.length()];   // 접미사를 저장할 배열

        // str의 접미사 저장
        for(int i=0;i<str.length();i++) {
            part_str[i] = "";   // 초기화
            for(int j=i;j<str.length();j++) {
                part_str[i] += str.charAt(j);
            }
        }

        // 정렬
        Arrays.sort(part_str, new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });

        for(String i : part_str) {
            System.out.println(i);
        }
        
    }
}
