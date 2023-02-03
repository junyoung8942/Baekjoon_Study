import java.util.Scanner;

public class p6996 {

    private static boolean solveAnagrams(String first, String second ) {
        if(first.length()!=second.length()) // 문자열 길이가 다를시
            return false;
        
        int alphabet[] = new int[26]; // 알파벳 개수만큼 생성

        for(char c : first.toCharArray()) { // first를 char형 배열로 만들어서 해당 알파벳 갯수 채우기
            alphabet[c-'a']++;
        }

        for(char c : second.toCharArray()) {
            alphabet[c-'a']--;
            if(alphabet[c-'a']<0) return false; // 알파벳이 first에 없거나 더 많을 시
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
        sc.close();
    }
}
