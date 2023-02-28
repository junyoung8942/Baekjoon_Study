package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class p1302 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hash = new HashMap<>();

        // 입력
        for(int i=0;i<n;i++) {
            String str = br.readLine();

            // 이미 존재하는 key일 때
            if(hash.containsKey(str)) {
                hash.put(str, hash.get(str) + 1);
            }
            // 존재하지 않는 key일 때
            else {
                hash.put(str, 1);
            }
        }

        // 가장 큰 value 찾기
        int max = 0;
        for(String i : hash.keySet()) {
            max = Math.max(max, hash.get(i));
        }

        // 리스트에 key값들 저장
        ArrayList<String> arr = new ArrayList<>(hash.keySet());
        Collections.sort(arr);  // key값들을 사전 순으로 정렬

        for(String i : arr) {
            if(hash.get(i) == max) {
                System.out.println(i);
                break;
            }
        }

    }
}
