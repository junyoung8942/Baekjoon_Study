package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p1764 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;    // 중복되는 문자열의 개수

        HashSet<String> set = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        // 입력
        for(int i=0;i<n;i++) {
            set.add(br.readLine());
        }

        for(int j=0;j<m;j++) {
            String temp = br.readLine();
            // 중복되는 문자열인 경우
            if(set.contains(temp)) {
                result.add(temp);
                cnt++;
            }
        }

        Collections.sort(result);

        System.out.println(cnt);
        for(String i : result) {
            System.out.println(i);
        }
    }
}
