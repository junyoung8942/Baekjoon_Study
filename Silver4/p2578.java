package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2578 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input[][] = new int[5][5];
        int random[][] = new int[5][5];
        boolean bingo[][] = new boolean[5][5];

        // 철수 빙고판 입력
        for(int i=0;i<5;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자가 부르는 번호
        for(int i=0;i<5;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++) {
                random[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 빙고 게임 시작
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {

                // 사회자가 부르는 번호와 일치하는 위치에 true값으로 변경
                for(int a=0;a<5;a++) {
                    boolean check = false;

                    for(int b=0;b<5;b++) {
                        if(input[a][b] == random[i][j]) {
                            bingo[a][b] = true;
                            check = true;
                            break;
                        }
                    }

                    if(check == true) {
                        break;
                    }
                }

                // 빙고의 개수가 3개가 넘어갈 시, 몇 번째에 빙고를 완성했나 출력
                if(count_bingo(bingo) >= 3) {
                    System.out.println((i * 5 + (j + 1)));
                    return;
                }
            }
        }
    }

    static int count_bingo(boolean bingo[][]) {
        int cnt = 0;
        
        // 가로줄에 빙고가 있는 경우
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                // 하나라도 false가 있을 시 다음 줄로 넘어감
                if(bingo[i][j] == false) {
                    break;
                }
                // 마지막에도 위의 조건문을 통과하면 빙고
                if(j == 4) {
                    cnt++;
                }
            }
        }

        // 세로줄에 빙고가 있는 경우
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                // 하나라도 false가 있을 시 다음 줄로 넘어감
                if(bingo[j][i] == false) {
                    break;
                }
                // 마지막에도 위의 조건문을 통과하면 빙고
                if(j == 4) {
                    cnt++;
                }
            }
        }

        // 대각선에 빙고가 있는 경우 (\방향)
        for(int i=0;i<5;i++) {
            if(bingo[i][i] == false) {
                break;
            }
            if(i == 4) {
                cnt++;
            }
        }

        // 대각선에 빙고가 있는 경우 (/방향)
        for(int i=0;i<5;i++) {
            if(bingo[i][4-i] == false) {
                break;
            }
            if(i == 4) {
                cnt++;
            }
        }

        return cnt;
    }
}
