package Silver5;

import java.util.Scanner;

public class p1010 {

    static double Factorial(double n) { // 펙토리얼 함수
        if(n==1 || n==0) return 1;
        else return (n * Factorial(n-1));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for(int i=0;i<count;i++) {
            double west = scan.nextInt();
            double east = scan.nextInt();

            double total =  Factorial(east) / (Factorial(west)*Factorial(east-west));  // 경우의 수

            System.out.printf("%.0f\n", total);
        }              

        scan.close();
    }
}
