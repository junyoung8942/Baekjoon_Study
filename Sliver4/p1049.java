package Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1049 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int need = Integer.parseInt(st.nextToken());
        int brand = Integer.parseInt(st.nextToken());

        int price[][] = new int[brand][2];

        int total_price = 0;

        // [][0]에는 6개 세트 가격, [][1]에는 개당 가격 입력
        for(int i=0;i<price.length;i++) {

            st = new StringTokenizer(br.readLine());

            for(int j=0;j<price[i].length;j++) {
                price[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int min_set_price = price[0][0];
        int min_once_price = price[0][1];

        // 세트 최소 가격, 개당 최소 가격 찾기
        for(int i=1;i<price.length;i++) {
            for(int j=0;j<price[i].length;j++) {
                if(j==0){
                    min_set_price = Math.min(min_set_price, price[i][j]);
                }
                else{
                    min_once_price = Math.min(min_once_price, price[i][j]);
                }
            }
        }
        
        // 가격 찾기
        total_price = Math.min(((need/6)+1)*min_set_price, need*min_once_price);
        total_price = Math.min(total_price, (need/6)*min_set_price + (need%6)*min_once_price);
        

        bw.write(String.valueOf(total_price));
        bw.close();
    }
}
