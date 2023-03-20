package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class p13414 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<String> set = new LinkedHashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int k = Integer.parseInt(st.nextToken());   // 수강 가능 인원
        int n = Integer.parseInt(st.nextToken());   // 학생들이 버튼을 클릭한 순서를 기록한 대기목록의 길이

        // 입력
        for(int i=0;i<n;i++) {
            String temp = br.readLine();

            // 이미 대기열에 들어가 있는 상태에서 다시 수강신청 버튼을 누를 경우
            if(set.contains(temp)) {
                set.remove(temp);
                set.add(temp);
            }
            // 대기열에 없는 상태에서 수강신청 버튼을 누를 경우
            else {
                set.add(temp);
            }
        }

        // Iterator를 사용하여 값을 출력
        Iterator iter = set.iterator();

        StringBuilder sb = new StringBuilder();

        // 수강 가능 인원보다 수강신청 인원이 적은 경우
        if(set.size() < k) {
            while(iter.hasNext()) {
                sb.append(iter.next()).append("\n");
            }
        }
        // 수강 가능 인원보다 수강신청 인원이 많은 경우
        else {
            for(int i=0;i<k;i++) {
                sb.append(iter.next()).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}
