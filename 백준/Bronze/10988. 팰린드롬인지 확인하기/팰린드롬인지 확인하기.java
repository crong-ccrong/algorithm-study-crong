import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int left = 0;
        int right = s.length() -1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        System.out.println(isPalindrome ? 1: 0);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}