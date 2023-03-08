package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p17219 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> hash = new HashMap<>();

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            hash.put(st.nextToken(), st.nextToken());
        }

        for(int i=0;i<m;i++) {
            System.out.println(hash.get(br.readLine()));
        }
    }
}
