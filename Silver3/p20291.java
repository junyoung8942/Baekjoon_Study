package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class p20291 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hash = new HashMap<>();

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            boolean check = false;  // .이 나올 경우 true
            String extension = "";

            for(int j=0;j<temp.length();j++) {
                // 확장자 저장
                if(check == true) {
                    extension += temp.charAt(j);
                }
                // .이 나올 경우
                if(temp.charAt(j) == '.') {
                    check = true;
                }
            }

            // 이미 존재하는 확장자일 경우
            if(hash.containsKey(extension)) {
                hash.put(extension, hash.get(extension) + 1);
            }
            // 존재하지 않는 확장자일 경우
            else {
                hash.put(extension, 1);
            }
        }

        // 리스트에 key값 저장
        ArrayList<String> list = new ArrayList<>(hash.keySet());

        // 리스트 정렬 (사전 순서)
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String i : list) {
            sb.append(i + " " + String.valueOf(hash.get(i))).append("\n");
        }
        System.out.println(sb);
    
    }
}
