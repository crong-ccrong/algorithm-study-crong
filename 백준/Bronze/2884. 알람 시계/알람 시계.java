import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        
        if (min >= 45) {
            min -= 45;
        } else {
            min += 15;
            hour = hour == 0 ? 23 : --hour;
        }
        
        System.out.println(hour + " " + min);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}