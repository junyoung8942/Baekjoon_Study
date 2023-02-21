package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student{
    String name;
    int kor, eng, math;

    // 생성자
    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class p10825 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        Student[] student = new Student[n];

        // 데이터 입력
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            student[i] = new Student(st.nextToken(),
                                    Integer.parseInt(st.nextToken()),
                                    Integer.parseInt(st.nextToken()),
                                    Integer.parseInt(st.nextToken()));
        }

        // 정렬
        Arrays.sort(student, new Comparator<>() {
            public int compare(Student s1, Student s2) {
                // 국어 점수가 s2가 더 큰 경우
                if(s1.kor < s2.kor) {
                    return 1;
                }
            
                else if(s1.kor == s2.kor) {
                    // 국어가 동점이며 영어점수가 더 작은 경우
                    if(s1.eng > s2.eng) {
                        return 1;
                    }

                    else if(s1.eng == s2.eng) {
                        // 국어와 영어가 동점이며 수학점수가 더 큰 경우
                        if(s1.math < s2.math) {
                            return 1;
                        }
                        // 성적이 모두 동일할 경우 이름으로 비교
                        else if(s1.math == s2.math) {
                            return s1.name.compareTo(s2.name);
                        }
                    }
                }
                return -1;
            }
        });

        // 출력
        for(int i=0;i<student.length;i++) {
            System.out.println(student[i].name);
        }
        
    }
}
