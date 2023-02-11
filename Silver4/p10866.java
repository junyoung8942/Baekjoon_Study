package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10866 {
    static int deque[] = new int[10000];
    static int front = 0;
    static int rear = 0;
    static int size = 0;

    // 정수를 덱의 앞에 넣는다.
    static void push_front(int value) {
        deque[front] = value;
        front = (front - 1 + 10000) % 10000;    // 뒤로 한 칸, 0 -> 9999
        size++;
    }

    // 정수를 덱의 뒤에 넣는다.
    static void push_back(int value) {
        rear = (rear + 1) % 10000;  // 앞으로 한 칸, 0 -> 1
        size++;
        deque[rear] = value;
    }

    static int pop_front() {
        if(size == 0) {
            return -1;
        }

        front = (front + 1) % 10000; // 앞으로 한 칸, 9999 -> 0
        size--;
        return deque[front];
    }

    static int pop_back() {
        if(size == 0) {
            return -1;
        }

        int value = deque[rear];
        rear = (rear - 1 + 10000) % 10000; // 뒤로 한 칸, 0 -> 9999
        size--;
        return value;
    }

    static int size() {
        return size;
    }

    static int empty() {
        if(size == 0) {
            return 1;
        }
        return 0;
    }

    static int front() {
        if(size == 0) {
            return -1;
        }
        return deque[(front + 1) % 10000];
    }

    static int back() {
        if(size == 0) {
            return -1;
        }
        return deque[rear];
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            switch(st.nextToken()) {
                case "push_front" :
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    System.out.println(pop_front());
                    break;
                case "pop_back" :
                    System.out.println(pop_back());
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
