package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p17413 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        boolean inout = false;  // <>안에 있을 시 true

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            
            if(c == '<') {
                inout = true;

                // 스택에 저장되어 있는 변수를 pop
                while(!stack.empty()) {
                    sb.append(stack.pop());
                }

                sb.append(c);
            }

            else if(c == '>') {
                inout = false;
                sb.append(c);
            }

            // <>안에 있을 시
            else if(inout) {
                sb.append(c);
            }

            // <>안에 있지 않을 경우
            else {
                // 공백일시 스택에 있는 변수를 pop
                if(c == ' ') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }

                    sb.append(c);
                }

                else {
                    stack.push(c);
                }
            }
        }

        // 스택이 비어있지 않을 경우
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
