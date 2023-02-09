package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10828 {
    static int top = -1;
    static int stack[];

    // 정수 value를 스택에 넣는 연산
    static void push(int value) {
        stack[++top] = value;
    }

    // pop 연산
    static int pop() {
        if(top == -1) 
            return top;
        else
            return stack[top--];
    }

    // 스택에 들어있는 정수의 개수를 출력한다.
    static int size() {
        return top+1;
    }

    // 스택이 비어있으면 1, 아니면 0을 출력한다.
    static int empty() {
        if(top == -1)
            return 1;
        else
            return 0;
    }

    // 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    static int top() {
        if(top == -1) 
            return -1;
        else
            return stack[top];
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        stack = new int[n]; // 명령어 개수만큼 배열 생성
        
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch(command) {
                case "push" : 
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    System.out.println(pop());
                    break;
                case "size" :
                    System.out.println(size());
                    break;
                case "empty" :
                    System.out.println(empty());
                    break;
                case "top" :
                    System.out.println(top());
                    break;
            }
        }
    }
}
