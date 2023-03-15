package Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9657 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    // 돌의 개수
        
        if(n % 7 ==0 || n % 7 == 2) {
            bw.write("CY");
        }
        else{
            bw.write("SK");
        }
        bw.close();
    }
}




// 상근이가 먼저 시작
// 돌은 1,3,4개 가져갈 수 있다, W = win, L = lose
// n=1, W
// n=2, L
// n=3, W
// n=4, W
// n=5, !(5-3) = W
// n=6, !(6-4) = W
// n=7, !(7-4) = L, !(7-3) = L, !(7-1) = L

// n=8, !(8-1) = W
// n=9, !(9-4) = L, !(9-3) = L, !(9-1) = L
// ...

// (n % 7 == 0 || n % 7 == 2)일 때 Lose




