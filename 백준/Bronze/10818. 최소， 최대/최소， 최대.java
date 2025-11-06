import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int min = a;
        int max = a;
        
        for (int i = 1; i < n; i++) {
            int b = Integer.parseInt(st.nextToken());
            min = Math.min(min, b);
            max = Math.max(max, b);
        }
        
        System.out.println(min + " " + max);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}