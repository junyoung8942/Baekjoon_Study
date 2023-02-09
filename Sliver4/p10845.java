package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10845 {
    static int queue[];
    static int front = 0;
    static int rear = 0;

    // 정수를 큐에 넣는 연산
    static void push(int value) {
        queue[front++] = value;
    }

    // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
    static int pop() {
        if(front == rear)
            return -1;
        else
            return queue[rear++];
    }

    // 큐에 들어있는 정수의 개수를 출력
    static int size() {
        return front - rear;
    }

    // 큐가 비어있으면 1, 아니면 0을 출력
    static int empty() {
        if(front == rear)
            return 1;
        else
            return 0;
    }

    // 큐의 가장 앞에 있는 정수를 출력
    static int front() {
        if(front == rear)
            return -1;
        else
            return queue[rear];
    }

    // 큐의 가장 뒤에 있는 정수를 출력
    static int back() {
        if(front == rear)
            return -1;
        else
            return queue[front-1];
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        queue = new int[n];

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
                case "front" :
                    System.out.println(front());
                    break;
                case "back" :
                    System.out.println(back());
                    break;
            }
        }
    }
}
