import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            
            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(m));
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}