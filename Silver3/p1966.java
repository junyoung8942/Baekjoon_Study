package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1966 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스
        
        for(int k=0;k<T;k++) {
            // n과 m 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 큐와 배열 생성
            Queue<int[]> queue = new LinkedList<>();
            Integer arr[] = new Integer[n];

            // 데이터 입력
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) {
                int temp = Integer.parseInt(st.nextToken());
                queue.add(new int[] {i, temp}); // {초기 위치, 중요도}
                arr[i] = temp;
            }

            // 정렬
            Arrays.sort(arr, Comparator.reverseOrder());

            int cnt = 0;            
            boolean check = false;  // 초기 위치가 동일한지 확인하는 변수

            for(int i=0;i<n;i++) {
                int temp = arr[i];  // 중요도가 가장 높은 값

                while(true) {
                    // 중요도가 동일할 경우
                    if(temp == queue.peek()[1]) {
                        cnt++;
                        // 찾고자하는 위치와 초기 위치가 동일한 경우
                        if(m == queue.peek()[0]) {
                            check = true;
                        }
                        queue.remove();
                        break;
                    }
                    queue.add(queue.remove());
                }

                // m의 값을 가진 초기위치를 찾았을 경우
                if(check == true) {
                    bw.write(String.valueOf(cnt));
                    bw.newLine();
                    break;
                }
            }
        }

        bw.close();
    }
}
