package Silver4;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1015 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());  // 배열길이

        int input[] = new int[len];         // 입력 값
        int copy_input[] = new int[len];    
        int output[] = new int[len];        // 출력 값

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 초기화
        for(int i=0;i<len;i++) {    
            input[i] = Integer.parseInt(st.nextToken());
            copy_input[i] = input[i];
            output[i] = -1;
        }

        Arrays.sort(copy_input); // 정렬

        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                // 정렬한 값과 입력 값이 동일하며 output에 값을 넣지 않은 경우
                if(copy_input[i] == input[j] && output[j] == -1) {  
                    output[j] = i;
                    break;
                }
            }
        }

        // 출력
        for(int i=0;i<len;i++) {
            bw.write(output[i]+" ");
        }
        bw.close();
    }    
}
