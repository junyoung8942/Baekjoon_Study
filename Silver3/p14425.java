package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p14425 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> hash = new HashMap(); 
        int cnt = 0;
        // 입력, value값은 딱히 필요 없음
        for(int i=0;i<n;i++) {
            hash.put(br.readLine(), 0);
        }

        // m개 만큼 입력
        for(int i=0;i<m;i++) {
            // 입력된 값이 hash에 포함되어 있을 경우
            if(hash.containsKey(br.readLine())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
