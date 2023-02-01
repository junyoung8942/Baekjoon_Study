import java.util.Scanner;

public class p2748 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        long output = 1;

        // 피보나치 수열을 구하기 위해 n-1, n-2번째의 값 설정
        long num1 = 0;
        long num2 = 1;
    
        // n번째 피보나치 수 구하기
        for(int i=1;i<n;i++) {
            output = num1 + num2;
            num1 = num2;
            num2 = output;
        }

        System.out.println(output);

        scan.close();
    }
}
