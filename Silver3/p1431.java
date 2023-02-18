package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p1431 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str[] = new String[n];
        
        for(int i=0;i<str.length;i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 길이가 다를 때, 짧은 것이 먼저온다
                if(s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }

                // 길이가 같으며 자리수의 합이 다를 때
                else if(function(s1) > function(s2)) {
                    return 1;
                }
                else if(function(s1) < function(s2)) {
                    return -1;
                }

                // 길이가 같으며, 각 자리수의 합이 같을 때 사전순으로 정렬
                else {
                    return s1.compareTo(s2);
                }
            }
        });

        // 출력
        for(String i : str) {
            System.out.println(i);
        }
    }

    // 문자열의 각 자리의 숫자의 합을 구하는 메소드
    static int function(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        return sum;
    }
}
