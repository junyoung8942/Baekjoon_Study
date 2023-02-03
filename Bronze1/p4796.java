import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4796 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 0;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int L = Integer.parseInt(st.nextToken());  // 사용가능 일
            int P = Integer.parseInt(st.nextToken());  // 연속하는 일
            int V = Integer.parseInt(st.nextToken());  // 휴가 일 수

            num++;
            int total = 0;  // 캠핑장 사용 일을 저장하는 변수

            if(L==0 && P==0 && V==0) break;

            // 캠핑장 사용 일 수 구하기
            while(true) {
                V = V - P;
                total += L;
                if(V < P) { // 남은 휴가 일 수가 연속하는 일보다 작을 때

                    if(V > L) { // 휴가의 남은 일 수가 사용가능일보다 클 때
                        total += L;
                    } 
                    else total += V;
                    
                    break;
                }
            }
            System.out.println("Case "+num+": "+total);
        }
    }
}
