package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p19941 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 식탁의 길이
        int k = Integer.parseInt(st.nextToken());   // 거리

        String str = br.readLine();
        boolean check[] = new boolean[str.length()];    // 햄버거를 먹었는지 체크하는 변수
        int cnt = 0;

        for(int i=0;i<n;i++) {
            // 사람인 경우
            if(str.charAt(i) == 'P') {
                boolean left = false; // 왼쪽에 먹을 수 있는 햄버거가 존재하지 않은 경우를 체크하는 변수

                // 왼쪽 방향으로 가장 먼 곳부터 H가 존재하는 경우
                for(int j=k;j>0;j--) {
                    if(i-j < 0) continue;

                    if(str.charAt(i-j) == 'H' && check[i-j] == false) {
                        cnt++;
                        check[i-j] = true;
                        left = true;
                        break;
                    }
                }

                // 왼쪽에 먹을 햄버거가 존재하지 않을 경우
                if(left == false) {
                    // 오른쪽 방향으로 가장 가까운 곳부터 H가 존재하는 경우
                    for(int j=1;j<=k;j++) {
                        if((i+j) >= str.length()) continue;

                        if(str.charAt(i+j) == 'H' && check[i+j] == false) {
                            cnt++;
                            check[i+j] = true;
                            break;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
