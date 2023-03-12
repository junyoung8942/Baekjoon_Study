package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class p2910 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 입력되는 순서를 저장하기 위해 LinkedHashMap 사용
        HashMap<Integer, Integer> hash = new LinkedHashMap<>(); // value, cnt

        st = new StringTokenizer(br.readLine());

        // 해시맵에 저장
        for(int i=0;i<n;i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(hash.containsKey(temp)) {
                hash.put(temp, hash.get(temp) + 1); 
            }
            else {
                hash.put(temp, 1);
            }
        }

        // 키 값 저장
        ArrayList<Integer> arr = new ArrayList<>(hash.keySet());

        // cnt가 많은 순대로 정렬(내림차순)
        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return hash.get(num2) - hash.get(num1);
            }
        });

        StringBuilder sb = new StringBuilder();

        // 출력
        for(int i : arr) {
            int cnt = hash.get(i);
            for(int j=0;j<cnt;j++) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}
