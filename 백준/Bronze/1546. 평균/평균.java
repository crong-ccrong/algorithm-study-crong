import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int sum = m;
        int max = m;
        for (int i = 1; i < n; i++) {
            m = Integer.parseInt(st.nextToken());
            max = Math.max(max, m);
            sum += m;
        }
        
        System.out.println(sum*100.0/max/n);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}