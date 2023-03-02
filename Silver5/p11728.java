package Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class p11728 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 합칠 배열 2개 준비
        Integer n[] = new Integer[Integer.parseInt(st.nextToken())];
        Integer m[] = new Integer[Integer.parseInt(st.nextToken())];

        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n.length;i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m.length;i++) {
            m[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 List로 변환
        List<Integer> list1 = new ArrayList(Arrays.asList(n));
        List<Integer> list2 = new ArrayList(Arrays.asList(m));
        
        // 두 리스트 합치기
        list1.addAll(list2);

        // 오름차순 정렬
        Collections.sort(list1);

        // 출력
        for(int i : list1) {
            bw.write(String.valueOf(i) + " ");
        }

        bw.close();
    }
}
