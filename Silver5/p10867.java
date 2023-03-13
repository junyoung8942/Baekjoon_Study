package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p10867 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();    // 중복되는 변수 저장 x

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            hash.add(Integer.parseInt(st.nextToken()));
        }


        // 정렬을 위해 ArrayList선언
        ArrayList<Integer> arr = new ArrayList<>(hash);
        
        Collections.sort(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
