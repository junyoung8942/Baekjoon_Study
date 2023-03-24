package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p16922 {
    static HashSet<Integer> result = new HashSet<>(); // 결과를 저장할 변수 (중복되는 값 존재X)
    static int arr[] = {1, 5, 10, 50};  // 로마 숫자
    static int temp[];  // 값을 저장할 변수
    static int n;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        temp = new int[n];

        dfs(0, 0);

        System.out.println(result.size());
    }

    // 백트래킹
    static void dfs(int start, int depth) {
        if(depth == n) {
            int total = 0;

            for(int i : temp) {
                total += i;
            }

            result.add(total);
            return;
        }

        for(int i=start;i<arr.length;i++) {
            temp[depth] = arr[i];
            dfs(i, depth + 1);
        }
    }
}
