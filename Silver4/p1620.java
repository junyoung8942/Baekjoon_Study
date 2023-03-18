package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p1620 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        
        HashMap<String, String> hash = new HashMap<>(); 

        // 입력
        for(int i=1;i<=n;i++) {
            String temp = br.readLine();

            // 찾을 때 포켓몬의 번호 or 포켓몬 이름으로 찾기 때문에 key와 value를 양방향(?)으로 저장
            hash.put(temp, String.valueOf(i));
            hash.put(String.valueOf(i), temp);
        }

        // 출력
        for(int i=0;i<m;i++) {
            System.out.println(hash.get(br.readLine()));
        }
    }
}
