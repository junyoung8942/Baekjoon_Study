package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10773 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        Stack<Integer> stack = new Stack<>();


        for(int i=0;i<n;i++) {
            int command = Integer.parseInt(br.readLine());
            
            // 0을 입력 받았을 때
            if(command == 0) {
                stack.pop();
            }
            // 0이 아닌 수를 입력 받았을 때
            else {
                stack.push(command);
            }
        }

        n = stack.size();

        for(int i=0;i<n;i++) {
            total += stack.pop();
        }

        System.out.println(total);
    }
}
