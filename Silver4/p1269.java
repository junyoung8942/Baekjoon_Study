package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p1269 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;

        // 집합 연산 : A - B
        for(int i : A) {
            if(!B.contains(i)) {
                cnt++;
            }
        }

        // 집합 연산 : B - A
        for(int i : B) {
            if(!A.contains(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
