package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1244 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 스위치의 개수

        int arr[] = new int[n]; // 스위치의 상태를 담을 변수

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = Integer.parseInt(br.readLine());  // 반복 횟수
        for(int k=0;k<cnt;k++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken()); // 성별
            int number = Integer.parseInt(st.nextToken());  // 받은 스위치 번호

            // 성별이 남성인 경우
            if(sex == 1) {
                // 받은 스위치의 번호 배수인 경우 스위치의 상태를 변경
                for(int i = (number - 1); i<n; i += number) {
                    if(arr[i] == 1) {
                        arr[i] = 0;
                    }
                    else {
                        arr[i] = 1;
                    }
                }
            }

            // 성별이 여성인 경우
            else if(sex == 2) {

                // 받은 스위치의 번호에 해당되는 스위치 변경
                if(arr[number - 1] == 0) {
                    arr[number - 1] = 1;
                }
                else if (arr[number - 1] == 1) {
                    arr[number - 1] = 0;
                }

                // 좌,우 중 더 짧은 구간
                int min_range = Math.min(n - number, number - 1);
                
                int i = 1;
                for(;i <= min_range; i++){
                    // 좌, 우의 index
                    int left = number - i - 1;
                    int right = number + i - 1;
                    
                    // 좌우가 대칭이며 0인 경우
                    if(arr[left] == arr[right] && arr[left] == 0) {
                        arr[left] = arr[right] = 1;
                    }
                    // 좌우가 대칭이며 1인 경우
                    else if (arr[left] == arr[right] && arr[left] == 1) {
                        arr[left] = arr[right] = 0;
                    }
                    else {
                        break;
                    }
                }
            }
        }


        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
            // 스위치를 출력할 때 한 줄에 최대 20개 출력
            if((i+1) % 20 == 0) {
                System.out.println();
            }
        }

    }
}
