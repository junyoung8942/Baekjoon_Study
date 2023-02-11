package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p1026 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int len = Integer.parseInt(br.readLine());
        int a[] = new int[len];
        Integer b[] = new Integer[len];
        int sum = 0;

        // A배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<len;i++) {    
            a[i] = Integer.parseInt(st.nextToken());
        }

        // B배열 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<len;i++) {    
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a); // A를 오름차순으로 정렬
        Arrays.sort(b, Comparator.reverseOrder());  //B를 내림차순으로 정렬

        for(int i=0;i<len;i++) {
            sum += a[i] * b[i];
        }
        
        bw.write(String.valueOf(sum));
        bw.close();
    }    
}
