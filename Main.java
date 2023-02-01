import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int dwarf[] = new int[9];
        int total = 0;
        
        // 아홉 난쟁이의 키 입력
        for(int i=0;i<dwarf.length;i++) {
            dwarf[i] = scan.nextInt();
            total += dwarf[i];
        }
        scan.close();
        
        // 아홉 난쟁이의 키를 오름차순으로 정렬
        for(int i=0;i<dwarf.length;i++) 
            for(int j=i+1;j<dwarf.length;j++) {

                // 두 난쟁이를 재외한 나머지 난쟁이의 키의 합이 100일 때
                if(total-dwarf[i]-dwarf[j] == 100) { 
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    Arrays.sort(dwarf);
                    
                    // 출력
                    for(int k=2;k<dwarf.length;k++)
                        System.out.println(dwarf[k]);

                    return;
                }
            }

    }
}