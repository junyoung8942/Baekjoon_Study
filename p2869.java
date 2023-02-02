// 짧은 처리시간을 위해 Scanner를 사용하지 않고 BufferedReader를 사용
// 1줄을 읽어서 A, B, V에 " "로 나누어 저장하며 해당 토큰을 int형으로 변환시켜준다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p2869{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // (A-B)는 하루에 이동하는 총 거리이며, (V-B)는 정상에 올라간 후에 미끄러지지 않기 때문에 일 수를 정확하게 계산하기 위해 빼놓음
        int day = (V-B) / (A-B);  

        if((V-B) % (A-B) != 0) { // 나머지가 있을 경우 +1일
            day++;
        }

        System.out.println(day);
    }
}
