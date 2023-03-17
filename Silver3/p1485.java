package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1485 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        int coordinate[][] = new int[4][2]; // 좌표

        for(int k=0;k<T;k++) {
            // 좌표 입력
            for(int i=0;i<4;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                
                coordinate[i][0] = Integer.parseInt(st.nextToken());
                coordinate[i][1] = Integer.parseInt(st.nextToken());
            }

            long distance[] = new long[6];  // 좌표간 거리
            int index = 0;

            // 거리계산
            for(int i=0;i<4;i++) {
                for(int j=i+1;j<4;j++) {
                    distance[index++] = ((coordinate[i][0] - coordinate[j][0]) * (coordinate[i][0] - coordinate[j][0])) + ((coordinate[i][1] - coordinate[j][1]) * (coordinate[i][1] - coordinate[j][1]));
                }
            }
            
            Arrays.sort(distance);  // 정렬, 대각선의 거리 같은 경우 각 변의 길이보다 더 큼

            // 정사각형일 경우
            if(distance[0] == distance[1] && distance[1] == distance[2] && distance[2] == distance[3] && distance[4] == distance[5]) {
                bw.write("1");
                bw.newLine();
            }
            // 정사각형이 아닐 경우
            else {
                bw.write("0");
                bw.newLine();
            }
        }
        
        bw.close();
    }
}
