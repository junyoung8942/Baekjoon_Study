package Silver5;

import java.util.Scanner;

public class p1316 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String word[] = new String[n];
        int count = 0;  // 연속되지 않은 단어 갯수
        boolean alphbet[] = new boolean[26];

        for(int i=0;i<n;i++) {
            word[i] = scan.next();
        }

        for(int i=0;i<n;i++) {

            for(int j=0;j<alphbet.length;j++) { // 초기화
                alphbet[j] = false;
            }

            alphbet[word[i].charAt(0)-'a'] = true; // 맨 처음 알파벳을 true로 저장

            for(int j=1;j<word[i].length();j++) {

                // 연속된 문자이거나 새로운 문자일 때
                if(word[i].charAt(j)==word[i].charAt(j-1) || alphbet[word[i].charAt(j) - 'a']==false) {
                    alphbet[word[i].charAt(j)-'a'] = true;
                }

                // 연속된 문자가 아니며 이미 나왔던 알파벳일 경우
                else if(word[i].charAt(j)!=word[i].charAt(j-1) && alphbet[word[i].charAt(j) -'a']==true) { 
                    count++;
                    break;
                }
            }
        }

        System.out.println(n-count);

        scan.close();
    }
}
