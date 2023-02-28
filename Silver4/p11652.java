package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class p11652 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> hash = new HashMap<>();   // <key, cnt>

        // 입력
        for(int i=0;i<n;i++) {
            Long num = Long.parseLong(br.readLine());

            // 키가 포함되어 있을 시 cnt+1
            if(hash.containsKey(num)) {
                hash.put(num, hash.get(num) + 1);
            }
            // 키가 포함되어 있지 않을 경우
            else {
                hash.put(num, 1);
            }
        }

        // 최대 cnt값 저장
        int max = 0;
        for(Long i : hash.keySet()) {
            max = Math.max(max, hash.get(i));
        }

        // key값을 오름차순 정렬
        ArrayList<Long> arr = new ArrayList<>(hash.keySet());
        Collections.sort(arr);

        for(Long i : arr) {
            if(hash.get(i) == max) {
                System.out.println(i);
                break;
            }
        }
        
    }
}
