package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p9375 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); // 테스트 케이스


        for(int i=0;i<test;i++) {
            HashMap<String, Integer> hash = new HashMap<>();    // 해시맵 <종류, 개수>
            
            int n = Integer.parseInt(br.readLine());    // 의상 개수
            
            for(int j=0;j<n;j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 옷 이름은 필요없음
                
                String kind = st.nextToken();   // 옷 종류

                // 이미 해시맵에 저장되어 있는 옷 종류일 때
                if(hash.containsKey(kind)) {
                    hash.put(kind, hash.get(kind) + 1);
                }
                
                // 해시맵에 저장되어 있는 옷 종류가 아닐 때
                else {
                    hash.put(kind, 1);
                }
            }

            int result = 1;

            for(int val : hash.values()) {
                result *= (val + 1);    // 안 입는 경우를 고려하여 각 종류별 옷에 +1
            }

            System.out.println((result - 1));  // 알몸인 상태를 제외
        }
    }
}
