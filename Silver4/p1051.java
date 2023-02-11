package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1051 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int num[][] = new int[row][col];

        // 입력
        for(int i=0;i<row;i++) {
            String str = br.readLine();
            for(int j=0;j<col;j++) {
                num[i][j] = str.charAt(j) - '0';
            }
        }

        int size = Math.min(col, row);

        while(size > 1) {
            // 최대로 될 수 있는 정사각형의 크기 = row-min or col-min
            for(int i=0;i<=row-size;i++) {
                for(int j=0;j<=col-size;j++) {
                    int start = num[i][j]; // 시작점
                    
                    // 꼭짓점 비교
                    if(start == num[i][j+size-1] && start == num[i+size-1][j] && start == num[i+size-1][j+size-1]) {
                        bw.write(String.valueOf(size*size));
                        bw.close();
                        return;
                    }
                }
            }
            // min*min 크기의 정사각형을 못찾았을 시
            size--;
        }

        bw.write(String.valueOf(size*size));
        bw.close();
    }
}
