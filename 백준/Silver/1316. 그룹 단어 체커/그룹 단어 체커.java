import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                result++;
            }
        }
        
        System.out.println(result);
    }
    
    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prev = 0;
        
        for (char c : word.toCharArray()) {
            if (c != prev) {
                if (visited[c - 'a']) {
                    return false;
                }
                visited[c - 'a'] = true;
                prev = c;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}