package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1213 {
    static int alphbet[] = new int[26];    // 해당 알파벳 개수 저장
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        
        // 팰린드롬을 만들기 위한 변수 선언
        char palindrome[] = new char[str.length()];
        int left = 0;
        int right = str.length() - 1;
        int mid = right / 2;

        // 해당하는 알파벳의 개수만큼 배열에 저장
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            int temp = c - 'A';
            alphbet[temp]++;
        }

        // 문자열의 크기가 짝수일 때
        if(str.length() % 2 == 0) {
            for(int i=0;i<alphbet.length;i++) {
                // 알파벳의 개수가 홀수인 알파벳이 존재할 경우
                if(alphbet[i] % 2 == 1) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
            
            
            for(int i=0;i<alphbet.length;i++) {      
                if(left > right) {
                    break;
                }

                // 알파벳이 존재할 경우
                if(alphbet[i] != 0) {
                    int cnt = alphbet[i];
                    
                    // 알파벳의 개수 만큼 배열의 앞 뒤에 문자를 추가
                    while(cnt != 0) {
                        palindrome[left++] = (char)('A' + i);
                        palindrome[right--] = (char)('A' + i);
                        cnt -= 2;
                    }
                }
            }
        }

        // 문자열의 크기가 홀수일 때
        else {
            int odd = 0;    // 홀수 알파벳의 개수

            // 알파벳의 개수가 홀수인 알파벳 숫자 세기
            for(int i=0;i<alphbet.length;i++) {
                if(alphbet[i] % 2 == 1) {
                    odd++;
                }
            }
            
            // 홀수의 개수가 1개인 경우 팬린드롬 문자열 만들기
            if(odd == 1) {

                for(int i=0;i<alphbet.length;i++) {
                    // 알파벳이 존재하는 것만
                    if(alphbet[i] != 0) {
                        int cnt = alphbet[i];

                        // 해당 알파벳의 개수가 짝수인 경우
                        if(cnt % 2 == 0) {
                            // 알파벳의 개수 만큼 배열의 앞 뒤에 문자를 추가
                            while(cnt != 0) {
                                palindrome[left++] = (char)('A' + i);
                                palindrome[right--] = (char)('A' + i);
                                cnt -= 2;
                            }
                        }

                        // 해당 알파벳의 개수가 홀수인 경우
                        else {
                            while(cnt != 0) {
                                if(cnt == 1) {
                                    palindrome[mid] = (char)('A' + i);
                                    cnt--;
                                }
                                else {
                                    palindrome[left++] = (char)('A' + i);
                                    palindrome[right--] = (char)('A' + i);
                                    cnt -= 2;
                                }
                            } 
                        }

                    }
                }
            }

            // 그 외의 경우
            else {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        // 출력
        for(char c : palindrome) {
            System.out.print(c);
        }

    } 
}
