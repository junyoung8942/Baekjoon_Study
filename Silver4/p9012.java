package Silver4;

import java.util.Scanner;
import java.util.Stack;

public class p9012 {

    static String solve(String s) {
        Stack<Character> stack = new Stack<>(); // 스택 생성
        
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            // 여는 괄호일 때
            if(c=='(') {
                stack.push(c);
            }
            // 여는 괄호가 아니며 스택이 비어있을 때
            else if(stack.empty()) {
                return "NO";
            }
            // 여는 괄호가 존재할 때
            else {
                stack.pop();
            }
        }

        //  스택에 아무것도 안들어 있을 시 = 여는 괄호와 닫는 괄호의 개수가 동일 할 때
        if(stack.empty()) {
            return "YES";
        }
        //  스택이 비어있지 않을 경우
        else {
            return "NO";
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        for(int i=0;i<n;i++) {
            System.out.println(solve(scan.next()));
        }

        scan.close();
    }
}
