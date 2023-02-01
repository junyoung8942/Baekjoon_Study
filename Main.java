import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // month와 day 입력받기
        int month = scan.nextInt();
        int day = scan.nextInt();

        // 1월~11월의 해당 일 수와 요일 변수 선언
        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String days[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        
        int total = 0;

        // 입력받은 month보다 작은 월의 총 일 수를 더하기
        for(int i=0;i<month;i++) {
            total += cal[i];
        }

        // 입력받은 day를 더해주기
        total += day-1;

        // 해당 요일 출력
        System.out.println(days[total%7]);

        scan.close();
    }
}