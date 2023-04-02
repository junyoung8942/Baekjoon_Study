package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1652 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Character arr[][] = new Character[n][n];

        // 데이터 입력 (. or X)
        for(int i=0;i<n;i++) {
            String str = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = str.charAt(j);
            }
        }  

        // 누울 수 있는 곳 (.이 2개 이상 붙어있는 경우)
        int col_cnt = 0, row_cnt = 0;

        // 가로로 누울 수 있는 경우
        for(int i=0;i<n;i++) {
            boolean check = true;  // X가 나와서 다른 공간을 만들 수 있는 경우 ex) ..X..
            for(int j=1;j<n;j++) {
                if(arr[i][j] == '.' && arr[i][j] == arr[i][j-1] && check == true) {
                    col_cnt++;
                    check = false;
                }
                if(arr[i][j] == 'X') {
                    check = true;
                }

            }
        }

        // 세로로 누울 수 있는 경우
        for(int i=0;i<n;i++) {
            boolean check = true;  // X가 나와서 다른 공간을 만들 수 있는 경우 ex) ..X..
            for(int j=1;j<n;j++) {
                if(arr[j][i] == '.' && arr[j][i] == arr[j-1][i] && check == true) {
                    row_cnt++;
                    check = false;
                }
                if(arr[j][i] == 'X') {
                    check = true;
                }
            }
        }
        
        System.out.print(col_cnt + " " + row_cnt);
    }
}
