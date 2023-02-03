import java.util.Scanner;
 
public class p4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] score; // 점수
		int N = scan.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			int student_cnt = scan.nextInt();	//학생 수 
			score = new int[student_cnt];
			
			double sum = 0;    // 성적 총합 
			
			// 성적 입력부분 
			for(int j = 0 ; j < student_cnt ; j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}
			
			double mean = (double)(sum / student_cnt) ;
			double count = 0; // 평균을 넘는 학생 수
			
			// 평균을 넘는 학생 찾기 
			for(int j = 0 ; j < student_cnt ; j++) {
				if(score[j] > mean) 
					count++;
            }
                
            double rate = count/student_cnt*100; // 비율
			
			System.out.printf("%.3f",rate);
            System.out.println("%");
		}
		scan.close();
	}
	
}
