package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2941 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int cnt = 0;

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            switch(c) {
                case 'c' :
                    // 'c='일 때
                    if(i < str.length() - 1 && str.charAt(i+1) == '=') {
                        cnt++;
                        i++;
                    }
                    // 'c-'일 때
                    else if(i < str.length() - 1 && str.charAt(i+1) =='-') {
                        cnt++;
                        i++;
                    }

                    else {
                        cnt++;
                    }
                    break;

                case 'd' :
                    // 'dz='일 때
                    if(i < str.length() - 2 && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
                        cnt++;
                        i += 2;
                    }
                    // 'd-'일 때
                    else if(i < str.length() - 1 && str.charAt(i+1) == '-') {
                        cnt++;
                        i++;
                    }
                    
                    else {
                        cnt++;
                    }
                    break;
                
                case 'l' :
                    // 'lj'일 때
                    if(i < str.length() - 1 && str.charAt(i+1) == 'j') {
                        cnt++;
                        i++;
                    }
                    
                    else {
                        cnt++;
                    }
                    break;
                
                case 'n' :
                    // 'nj'일 때
                    if(i < str.length() - 1 && str.charAt(i+1) == 'j') {
                        cnt++;
                        i++;
                    }
                    
                    else {
                        cnt++;
                    }
                    break;

                case 's' :
                    // 's='일 때
                    if(i < str.length() - 1 && str.charAt(i+1) == '=') {
                        cnt++;
                        i++;
                    }
                    
                    else {
                        cnt++;
                    }
                    break;
                
                case 'z' :
                    // 'z='일 때
                    if(i < str.length() - 1 && str.charAt(i+1) == '=') {
                        cnt++;
                        i++;
                    }
                    
                    else {
                        cnt++;
                    }
                    break;
                
                default :
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
