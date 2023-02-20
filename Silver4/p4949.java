package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p4949 {
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String str = br.readLine();
            boolean b = true;

            if(str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack();
            
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);

                if(c == '(' || c == '[') {
                    stack.push(c);
                }

                else if(c == ')') {
                    // 스택이 비어 있거나 소괄호랑 매칭이 안될 경우
                    if(stack.empty() || stack.peek() != '(' ) {
                        b = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }

                else if(c == ']') {
                    // 스택이 비어 있거나 소괄호랑 매칭이 안될 경우
                    if(stack.empty() || stack.peek() != '[') {   
                        b = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            // 스택이 비어있을 경우
            if(b == true && stack.empty()) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }
}
