package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p10814 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String member[][] = new String[n][2];   // age, name

        // 회원정보 입력
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }

        // 오름차순 정렬
        Arrays.sort(member, new Comparator<String[]>() {
            public int compare(String num1[], String num2[]) {
                // 나이순으로 정렬
                return Integer.parseInt(num1[0]) - Integer.parseInt(num2[0]);
            }
        });

        for(int i=0;i<n;i++) {
            System.out.println(member[i][0] + " " + member[i][1]);
        }
    }
}
