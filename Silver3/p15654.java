package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p15654 {
    static int arr[], temp[];
    static boolean check[];
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];   // 값을 담을 변수
        temp = new int[m];  // 출력할 변수
        check = new boolean[n];
        
        st = new StringTokenizer(br.readLine());

        // 입력
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 정렬

        function(0);
        System.out.println(sb.toString());
    }

    static void function(int depth) {
        if(depth == m) {
            for(int i : temp) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<n;i++) {
            if(!check[i]) {
                check[i] = true;
                temp[depth] = arr[i];
                function(depth + 1);
                check[i] = false;
            }
        }
    }
}
