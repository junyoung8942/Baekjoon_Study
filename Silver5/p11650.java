package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p11650 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        Integer arr[][] = new Integer[n][2];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2차원 배열 정렬
        Arrays.sort(arr, new Comparator<Integer[]>() {

            public int compare(Integer num1[], Integer num2[]) {
                // x좌표가 동일할 경우, y좌표로 비교하여 오름차순 정렬
                // num1[0] == num2[0]으로 하면 틀림
                if(num1[0].equals(num2[0])) {
                    return num1[1] - num2[1];
                }
                // x좌표 오름차순 정렬
                else {
                    return num1[0] - num2[0];
                }
            }
        });

        for(int i=0;i<n;i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
