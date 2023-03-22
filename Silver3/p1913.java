package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1913 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());        // 크기 (n*n)
        int find_num = Integer.parseInt(br.readLine()); // 찾고자 하는 숫자

        int arr[][] = new int[n][n];
        

        int row = n/2; // 열의 위치
        int col = n/2; // 행의 위치

        // 찾고자 하는 숫자의 위치
        int find_row = row;
        int find_col = col;

        arr[row][col] = 1;  // 가운데 위치

        int num = 2; // 저장할 값

        // 값 저장
        for(int i=1; i <= 2 * n - 2; i++) {
            int cnt = ((i+3) / 4) * 2; // 몇 번 연산을 해야하는지 저장하는 변수 (회전수)

            switch(i % 4) {
                case 0 :
                    for(int j=0;j<cnt;j++) {
                        row--;  // 한 칸 위로
                        if(num == find_num) {
                            find_col = col;
                            find_row = row;
                        }
                        arr[row][col] = num++;
                    }
                    break;
                case 1 : 
                    row--; // 한 칸 위로
                    if(num == find_num) {
                        find_col = col;
                        find_row = row;
                    }
                    arr[row][col] = num++;
                    for(int j=1;j<cnt;j++) {
                        col++;  // 한 칸 오른쪽으로
                        if(num == find_num) {
                            find_col = col;
                            find_row = row;
                        }
                        arr[row][col] = num++;
                    }
                    break;
                case 2 :
                    for(int j=0;j<cnt;j++) {
                        row++;  // 한 칸 밑으로
                        if(num == find_num) {
                            find_col = col;
                            find_row = row;
                        }
                        arr[row][col] = num++;
                    }
                    break;
                case 3 :
                    for(int j=0;j<cnt;j++) {
                        col--; // 한 칸 왼쪽으로
                        if(num == find_num) {
                            find_col = col;
                            find_row = row;
                        }
                        arr[row][col] = num++;
                    }
                    break;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        sb.append((find_row + 1) + " " + (find_col + 1));
        System.out.println(sb);
    }
}
