package Broze1;

import java.util.Scanner;
 
public class p8595 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt(); // 문자열 길이
        char word[] = scan.next().toCharArray();

        String num = "";
        long sum = 0;
        
        for(char c : word) {
            if(c >= '0' && c <= '9') {  // 0~9 사이일 때
                num += c;
            }
            else {
                if(num.length() > 0) {  // num이 비어있지 않을 경우
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        
        if(num.length() > 0) {  // for문이 끝났을 때, num에 숫자가 있을 경우
            sum += Long.parseLong(num);
        }

        System.out.println(sum);

        scan.close();
    }
    
}
