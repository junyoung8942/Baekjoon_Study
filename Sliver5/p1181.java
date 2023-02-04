package Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1181 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        String word[] = new String[n];

        for(int i=0;i<n;i++) {  // 단어 입력
            word[i] = scan.next();
        }

        Arrays.sort(word, new Comparator<String>() {    // 특정 규칙에 의해 비교하고 싶을 경우 Comparator를 구현
            public int compare(String s1, String s2) {  // 양수일 경우 위치 교환, 0이나 음수일 경우 위치 변경X
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);    // 사전순 정렬, compareTo 메소드 이용
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(word[0]);

        for(int i=1;i<n;i++) {
            if(!word[i].equals(word[i-1])){   // 중복되지 않는 단어만 출력
                System.out.println(word[i]);
            }
        }

        scan.close();
    }
}
