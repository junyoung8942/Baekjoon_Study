package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13305 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int distance[] = new int[n-1];  // 인접한 도시들 간의 거리
        int cost[] = new int[n];    // 도시의 기름 가격

        // 거리 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<distance.length;i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        // 기름 가격 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<cost.length;i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;               // 총 비용 
        long min_cost = cost[0];    // 비용이 싼 값 저장

        for(int i=0;i<n-1;i++) {
            // 현재 도시의 주유소 비용이 더 싼 경우 (즉, 내림차순일 때만 값을 갱신)
            if(cost[i] < min_cost) {
                min_cost = cost[i];
            }
            
            sum += min_cost * distance[i];
        }

        System.out.println(sum);
    }
}
