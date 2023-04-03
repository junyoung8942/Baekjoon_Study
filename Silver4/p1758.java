package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p1758 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 손님의 수

        Integer arr[] = new Integer[n]; // 팁을 담을 변수
        int total = 0;

        // 팁 입력
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 내림차순 정렬
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for(int i=0;i<n;i++) {
            int tip = arr[i] - i;   // 실제로 받을 팁 (돈 - 받은 등수 - 1)
            if(tip > 0) {
                total += tip;
            }
            else{
                break;
            }
        }

        System.out.println(total);
        
    }
}
