package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2512 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cost[] = new int[n];    // 지방예산
        long total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            cost[i] = Integer.parseInt(st.nextToken());
            total+=cost[i];
        }

        int national = Integer.parseInt(br.readLine()); // 국가예산

        // 내림차순 정렬
        Arrays.sort(cost);

        // 국가 예산이 지방 예산보다 많은 경우
        if(total <= national) {
            System.out.println(cost[n-1]);
            return;
        }

        int low = 0;
        int high = cost[n-1];

        // 이진탐색
        while(high >= low) {
            int mid = (high + low) / 2;
            
            total = 0;

            // 예산 총합 더하기
            for(int i=0;i<n;i++) {
                // 지방예산이 mid보다 클 경우
                if(cost[i] > mid) {
                    total += mid;
                }
                // 지방예산이 mid보다 작거나 같을 경우
                else {
                    total += cost[i];
                }
            }

            // 국가 예산이 지방예산의 총 합보다 더 클 경우
            if(total <= national) {
                low = mid + 1;
            }
            // 국가 예산이 지방예산보다 더 작을 경우
            else {
                high = mid - 1;
            }
        }

        System.out.println(high);
    }        
}
