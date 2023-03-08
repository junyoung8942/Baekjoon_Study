package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p11478 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Set<String> set = new HashSet<>();  // 집합, 중복 값을 허용하지 않음

        for(int i=0;i<str.length();i++) { 

            for(int j=i+1;j<=str.length();j++){    
                set.add(str.substring(i, j));  // 부분 문자열
            }
        }

        System.out.println(set.size());
    }
}
