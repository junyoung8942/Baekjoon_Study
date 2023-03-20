package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p15655 {
    static int arr[], temp[];
    static int n, m;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        temp = new int[m];
        
        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 오름차순 정렬

        function(0, 0);
    }

    static void function(int index, int depth) {
        if(depth == m) {
            for(int i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(;index<n;index++) {
            temp[depth] = arr[index];
            function(index + 1, depth + 1);
        }
    }
}   
