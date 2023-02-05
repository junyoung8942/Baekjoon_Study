package Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1427 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        Integer num[] = new Integer[input.length()];


        for(int i=0;i<num.length;i++)
            num[i] = input.charAt(i)-'0';

        Arrays.sort(num, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });

        for(int i=0;i<num.length;i++)
            System.out.print(num[i]);

        scan.close();
    }
}
