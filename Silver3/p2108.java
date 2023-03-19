package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class p2108 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        HashMap<Integer, Integer> hash = new HashMap<>();

        double avg = 0;
        int median, mode = 0, range;    // 중앙값, 최빈값, 범위(최대값 - 최솟값)
        
        // 데이터 입력
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            avg += arr[i];

            if(!hash.containsKey(arr[i])) {
                hash.put(arr[i], 1);
            }
            else {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            }
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        avg = Math.round(avg / arr.length);
        median = arr[arr.length / 2];
        range = arr[arr.length - 1] - arr[0];

        // 리스트에 존재하는 key값들 저장
        ArrayList<Integer> list = new ArrayList<>(hash.keySet());
        Integer frequency[] = new Integer[list.size()]; // 빈도수

        // 빈도수 저장
        for(int i=0;i<list.size();i++) {
            frequency[i] = hash.get(list.get(i));
        }

        // 빈도수 오름차순 정렬, 키 값 내림차순 정렬
        Arrays.sort(frequency, Comparator.reverseOrder());
        Collections.sort(list);

        boolean check = false;

        // 최빈값이 여러개인 경우
        if(frequency.length > 1 && frequency[0] == frequency[1]) {
            check = true;
        }
        
        // 최빈값이 여러개일 경우, 2번째로 작은 값 저장
        for(int i : list) {
            if(frequency[0] == hash.get(i) && check == true) {
                check = false;
                continue;
            }
            else if(frequency[0] == hash.get(i) && check == false) {
                mode = i;
                break;                    
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append((int)avg).append("\n");
        sb.append(median).append("\n");
        sb.append(mode).append("\n");
        sb.append(range);
        System.out.println(sb);
    }
}   
