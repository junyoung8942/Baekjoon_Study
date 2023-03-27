package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10972 {
    static int permutation[];
    static int n;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 크기

        permutation = new int[n];  // 순열 값을 저장하는 변수
        
        // 순열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());    
        for(int i=0;i<n;i++) {
            permutation[i] = Integer.parseInt(st.nextToken());
        }

        // 다음 순열 찾기
        if(next_permutation()) {
            for(int i : permutation) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println("-1");
        }
    }

    // 다음 순열 값을 찾는 함수
    static boolean next_permutation() {
        int i = permutation.length - 1;

        // 순열의 마지막 수에서 끝나는 가장 긴 감소 수열 찾기
        while(i > 0 && permutation[i] <= permutation[i - 1]) {
            i--;
        }
        // 마지막 순열인 경우
        if(i <= 0) return false;

        // j >= i 이면서 per[j] > per[i-1]을 만족하는 가장 큰 j 찾기
        int j = permutation.length - 1;
        while(permutation[j] <= permutation[i - 1]) {
            j--;   
        }

        // per[j]와 per[i-1]를 swap
        int temp = permutation[j];
        permutation[j] = permutation[i - 1];
        permutation[i - 1] = temp;

        j = permutation.length - 1;
        // per[i]부터 순열을 뒤집기
        while(i < j) {
            temp = permutation[i];
            permutation[i] = permutation[j];
            permutation[j] = temp;
            i++;
            j--;
        }
        
        return true;
    }
}
