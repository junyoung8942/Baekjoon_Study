import java.util.Scanner;
public class p2775 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int apt[][] = new int[15][15]; // 아파트 k층 n호의 사는 인원을 담는 변수

        for(int i=0;i<apt[0].length;i++) {
            apt[0][i] = i;  // 0층 i호
            apt[i][1] = 1;  // i층 1호
        }

        for(int i=1;i<apt.length;i++) {  // 1층부터 14층까지
            for(int j=2;j<apt[i].length;j++) { // 2호부터 14호까지
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }


        int T = scan.nextInt(); // 테스트 케이스

        for(int i=0;i<T;i++) {
            int k = scan.nextInt(); // 층 입력
            int n = scan.nextInt(); // 호 입력
            System.out.println(apt[k][n]);
        }

        scan.close();
    }
    
}
