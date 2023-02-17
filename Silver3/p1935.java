package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        double arr[] = new double[num];

        for(int i=0;i<arr.length;i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        
        for(int i=0;i<input.length();i++) {
            char c = input.charAt(i);

            switch(c) {
                case '*' :
                   stack.push(stack.pop() * stack.pop());
                   break;
                case '/' :
                    double temp1 = stack.pop();
                    stack.push(stack.pop() / temp1);
                    break;
                case '+' :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-' :
                    double temp2 = stack.pop();
                    stack.push(stack.pop() - temp2);
                    break;
                // 문자일 경우
                default :
                    stack.push(arr[c-'A']);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
